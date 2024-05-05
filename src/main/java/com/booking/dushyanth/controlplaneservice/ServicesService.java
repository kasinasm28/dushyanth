package com.booking.dushyanth.controlplaneservice;

import com.booking.dushyanth.repository.ServicesRepository;
import com.booking.dushyanth.entity.Services;  // Ensure this is correctly imported
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // Using the aliased annotation
public class ServicesService {
    @Autowired
    private ServicesRepository serviceRepository;

    public List<Services> findAllServices() {
        return serviceRepository.findAll();
    }

    public Services findServiceById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    public Services saveService(Services service) {
        return serviceRepository.save(service);
    }
}