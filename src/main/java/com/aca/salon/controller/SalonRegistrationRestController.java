package com.aca.salon.controller;

import com.aca.salon.model.dto.SalonInfo;
import com.aca.salon.model.entity.Salon;
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
public class SalonRegistrationRestController {
    public final SalonService salonService;
 @Autowired
    public SalonRegistrationRestController(SalonService salonService) {
        this.salonService = salonService;
    }



    @RequestMapping(value = "/register", method = RequestMethod.POST,
            consumes = "application/json")
    public ResponseEntity register(@RequestBody SalonInfo salonInfo){
        try{
           salonService.add(salonInfo);


            return ResponseEntity.ok(tokenGenerator());
        }catch (RuntimeException e){
            return new ResponseEntity<>("exception during register", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @RequestMapping(value = "/sdfs/{userId}", method = RequestMethod.GET)
    public ResponseEntity foo(@RequestParam String userId){
        return null;
    }

    public String tokenGenerator(){
        String s = "";
        double d;
        for (int i = 1; i <= 16; i++) {
            d = Math.random() * 10;
            s = s + ((int)d);
            if (i % 4 == 0 && i != 16) {
                s = s + "-";
            }
        }
        return s;
    }

}
