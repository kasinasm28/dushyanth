package com.booking.dushyanth.headend;


import com.booking.dushyanth.controlplaneservice.ServicesService;
import com.booking.dushyanth.entity.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServicesController {
    @Autowired
    private ServicesService serviceService;

    @GetMapping
    public List<Services> getAllServices() {
        return serviceService.findAllServices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Services> getServiceById(@PathVariable Long id) {
        Services service = serviceService.findServiceById(id);
        if (service != null) {
            return ResponseEntity.ok(service);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Services createService(@RequestBody Services service) {
        return serviceService.saveService(service);
    }
}
