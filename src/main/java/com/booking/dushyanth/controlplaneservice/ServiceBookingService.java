package com.booking.dushyanth.controlplaneservice;


import com.booking.dushyanth.entity.ServiceBooking;
import com.booking.dushyanth.repository.ServiceBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceBookingService {
    @Autowired
    private ServiceBookingRepository serviceBookingRepository;

    public List<ServiceBooking> findAllServiceBookings() {
        return serviceBookingRepository.findAll();
    }

    public ServiceBooking findServiceBookingById(Long id) {
        return serviceBookingRepository.findById(id).orElse(null);
    }

    public ServiceBooking saveServiceBooking(ServiceBooking serviceBooking) {
        return serviceBookingRepository.save(serviceBooking);
    }
}
