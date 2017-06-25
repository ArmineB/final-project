package com.aca.salon.controller;

import com.aca.salon.model.dto.SalonInfo;
import com.aca.salon.model.entity.Employee;
import com.aca.salon.model.entity.Salon;
import com.aca.salon.service.AuthService;
import com.aca.salon.service.EmployeeWorkloadService;
import com.aca.salon.service.SalonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Armine on 13/06/2017.
 */
@RestController
@RequestMapping("/salons")
public class SalonRestController {
    private final AuthService authService;
    private  final EmployeeWorkloadService employeeWorkloadService;
    private  final SalonInfoService salonInfoService;


    @Autowired
    public SalonRestController(AuthService authService,
                               EmployeeWorkloadService employeeWorkloadService,
                               SalonInfoService salonInfoService) {
        this.authService = authService;
        this.employeeWorkloadService = employeeWorkloadService;
        this.salonInfoService = salonInfoService;
    }

    @RequestMapping(value = "/salon")
    public SalonInfo getSalon(@RequestParam("salonId") Integer salonId){

         return salonInfoService.getSalonInfo(salonId);
    }



}
