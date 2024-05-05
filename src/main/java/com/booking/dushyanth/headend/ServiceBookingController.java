package com.booking.dushyanth.headend;


import com.booking.dushyanth.controlplaneservice.ServiceBookingService;
import com.booking.dushyanth.entity.ServiceBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/serviceBookings")
public class ServiceBookingController {
    @Autowired
    private ServiceBookingService serviceBookingService;

    @GetMapping
    public List<ServiceBooking> getAllServiceBookings() {
        return serviceBookingService.findAllServiceBookings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceBooking> getServiceBookingById(@PathVariable Long id) {
        ServiceBooking serviceBooking = serviceBookingService.findServiceBookingById(id);
        if (serviceBooking != null) {
            return ResponseEntity.ok(serviceBooking);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ServiceBooking createServiceBooking(@RequestBody ServiceBooking serviceBooking) {
        return serviceBookingService.saveServiceBooking(serviceBooking);
    }
}