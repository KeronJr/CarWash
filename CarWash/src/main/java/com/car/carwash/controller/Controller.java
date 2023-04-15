package com.car.carwash.controller;

import com.car.carwash.model.Car;
import com.car.carwash.service.CarWashService;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@org.springframework.stereotype.Controller
public class Controller {

    public final CarWashService carWashService;

    public Controller(CarWashService carWashService) {
        this.carWashService = carWashService;
    }

    @GetMapping("/")
    public String listcars (Model model){
        model.addAttribute("car", carWashService.getAllCarList());
        return "list";
    }

    @GetMapping("/add")
    public String AddCars (Model model){
        model.addAttribute("car",new Car());
        return "bookCarWash";
    }

    // http://localhost:23614
    @PostMapping("/add")
    public String addCarsSubmit(@ModelAttribute Car md, RedirectAttributes redirectAttributes){
        carWashService.saveCarWash(md);
        redirectAttributes.addFlashAttribute("car", "Car added successfully!");
        return "redirect:/";
    }

    @GetMapping("/edit/{plate_no}")
    public String editStudentForm(@PathVariable("plate_no") String Plate_no, Model model){
        model.addAttribute("cars", carWashService.getAllCarsByPlate(Plate_no).orElse(null));
        return "editcars";
    }


    @PostMapping("/edit")
    public String editStudentSubmit(@ModelAttribute Car md){
        carWashService.saveCarWash(md);
        return "redirect:/";
    }

    @GetMapping("/delete/{plate_no}")
    public String deleteStudent(@PathVariable("plate_no")String Plate_no){
        carWashService.deleteByPlate(Plate_no);
        return "redirect:/";
    }

}
