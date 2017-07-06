package com.aca.salon.controller;

import com.aca.salon.model.dto.EmployeeWorkload;
import com.aca.salon.model.dto.SalonData;
import com.aca.salon.model.entity.Salon;
import com.aca.salon.service.AuthService;
import com.aca.salon.service.EmployeeWorkloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;


import java.io.IOException;
import java.util.List;

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
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity registerSalon (@RequestBody SalonData salon, @RequestParam("image") MultipartFile file) {
       byte[] image = null;

        if (!file.isEmpty()) {
            try {
              image = file.getBytes();
            }  catch (IOException e) {
                    return new ResponseEntity<>("You failed to upload " + e.getMessage(),HttpStatus.BAD_REQUEST);
                }
            } else {
                return new ResponseEntity<>("You failed to upload because the file was empty.", HttpStatus.BAD_REQUEST);
            }

                try {
            String token = authService.add(salon,image);

            return ResponseEntity.ok(token);
        } catch (RuntimeException e) {
            return new ResponseEntity<>("exception during register", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @RequestMapping(value = "/createEmployee", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity registerEmployeeWorkload(@RequestBody List<EmployeeWorkload> employeeWorkload,
                                         @RequestHeader("Authorized") String authToken) {

        Integer salonID = authService.getSalonIdByToken(authToken);
        for(EmployeeWorkload employeeWorkload1 : employeeWorkload) {
            employeeWorkloadService.add(employeeWorkload1, salonID);
        }
        try {
            return ResponseEntity.ok(authToken);
        } catch (RuntimeException e) {
            return new ResponseEntity<>("exception during register", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    }
