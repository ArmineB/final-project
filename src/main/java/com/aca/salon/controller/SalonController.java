package com.aca.salon.controller;

import com.aca.salon.model.entity.Salon;
import com.aca.salon.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Armine on 23/05/2017.
 */
@Controller
@RequestMapping("/")
public class SalonController {

    private List<Salon> salonList;
    private AuthService authService;

    @Autowired
    public SalonController() {
       salonList = authService.getAllSalons();
    }

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

}
