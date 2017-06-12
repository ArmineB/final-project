package com.aca.salon.controller;

import com.aca.salon.model.dto.SalonInfo;
import com.aca.salon.model.entity.Salon;
import com.aca.salon.service.AuthService;
import com.aca.salon.service.SalonService;
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

    @Autowired
    public AuthRestController(AuthService authService) {
        this.authService = authService;
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST,
            consumes = "application/json")
    public ResponseEntity registerSalon(@RequestBody SalonInfo salonInfo) {
        try {
            authService.add(salonInfo);
            return ResponseEntity.ok(tokenGenerator());
        } catch (RuntimeException e) {
            return new ResponseEntity<>("exception during register", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @RequestMapping(value = "/sdfs/{userId}", method = RequestMethod.GET)
    public ResponseEntity foo(@RequestParam String userId) {
        return null;
    }



}
