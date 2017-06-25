package com.aca.salon.controller;

import com.aca.salon.model.entity.Salon;
import com.aca.salon.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Armine on 23/05/2017.
 */
@Controller
@RequestMapping("/")
public class SalonController {

    private List<Salon> salonList;
    private final AuthService authService;

    @Autowired
    public SalonController(AuthService authService) {
        this.authService = authService;
       salonList = authService.getAllSalons();
    }

    @RequestMapping("/")
    public ModelAndView homePage(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("salonList", salonList);
        return modelAndView;
    }

}
