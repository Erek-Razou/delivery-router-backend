package com.erekrazou.deliveryrouterbackend.controllers;

import com.erekrazou.deliveryrouterbackend.services.GeoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/geo")
public class GeoController {
    private final GeoService geoService;

    public GeoController(GeoService geoService) {
        this.geoService = geoService;
    }

    @GetMapping(value = "/the-one", produces = "application/json")
    public ResponseEntity<Object> theOne() {
        return geoService.theOne();
    }
}
