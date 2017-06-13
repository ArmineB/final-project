package com.aca.salon.controller;

import com.aca.salon.model.dto.EmployeeWorkload;
import com.aca.salon.model.entity.Salon;
import com.aca.salon.service.AuthService;
import com.aca.salon.service.EmployeeWorkloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Armine on 23/05/2017.
 */
@RestController
@RequestMapping("/auth")
public class AuthRestController {

    private final AuthService authService;
    private  final EmployeeWorkloadService employeeWorkloadService;

    @Autowired
    public AuthRestController(AuthService authService,
                              EmployeeWorkloadService employeeWorkloadService) {
        this.authService = authService;
        this.employeeWorkloadService = employeeWorkloadService;
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST,
            consumes = "application/json")
    public ResponseEntity registerSalon(@RequestBody Salon salon) {
        try {
            String token = authService.add(salon);

            return ResponseEntity.ok(token);
        } catch (RuntimeException e) {
            return new ResponseEntity<>("exception during register", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @RequestMapping(value = "/fjhfi", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity registerEmployeeWorkload(@RequestBody EmployeeWorkload employeeWorkload) {
        Integer salonID = null;
        employeeWorkloadService.add(employeeWorkload, salonID);
        return  null;

    }

    }
