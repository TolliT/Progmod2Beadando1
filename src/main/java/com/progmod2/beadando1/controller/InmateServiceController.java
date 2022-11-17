package com.progmod2.beadando1.controller;

import com.progmod2.beadando1.model.Inmate;
import com.progmod2.beadando1.service.InmateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InmateServiceController {
    @Autowired
    InmateService inmateService;

    @RequestMapping(value = "/inmates")
    public ResponseEntity<Object> getInmates() {
        return new ResponseEntity<>(inmateService.listInmates(), HttpStatus.OK);
    }

    @RequestMapping(value = "/inmates", method = RequestMethod.POST)
    public ResponseEntity<Object> addInnmate(@RequestBody Inmate inmate) {
        inmateService.addInmate(inmate);
        return new ResponseEntity<>("Inmate added successfully", HttpStatus.CREATED);
    }
}
