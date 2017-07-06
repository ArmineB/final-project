package com.aca.salon.controller;

import com.aca.salon.model.dto.ReserveInfo;
import com.aca.salon.model.dto.SalonInfo;
import com.aca.salon.model.entity.Employee;
import com.aca.salon.model.entity.Salon;
import com.aca.salon.service.AuthService;
import com.aca.salon.service.EmployeeWorkloadService;
import com.aca.salon.service.ReserveInfoService;
import com.aca.salon.service.SalonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Armine on 13/06/2017.
 */
@RestController
@RequestMapping("/salons")
public class SalonRestController {
    private  final SalonInfoService salonInfoService;
    private final ReserveInfoService reserveInfoService;

    @Autowired
    public SalonRestController(SalonInfoService salonInfoService, ReserveInfoService reserveInfoService) {
        this.salonInfoService = salonInfoService;
        this.reserveInfoService = reserveInfoService;
    }




    @RequestMapping(value = "/salon", method = RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public SalonInfo getSalon(@RequestParam("salonId") Integer salonId){

         return salonInfoService.getSalonInfo(salonId);
    }

    @RequestMapping(value = "/reserve",  method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity reserve(@RequestBody ReserveInfo reserveInfo){
         Integer clientId = reserveInfoService.add(reserveInfo);
        try {

           return new ResponseEntity<>("reserved",HttpStatus.ACCEPTED); //harcnel

        } catch (RuntimeException e) {
            return new ResponseEntity<>("exception during reservation", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
