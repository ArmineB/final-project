package com.aca.salon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Armine on 23/05/2017.
 */
@Controller
@RequestMapping("/")
public class SalonController {
    @RequestMapping("/")
    public String homePage(){
        return "jsp/index";
    }
}
