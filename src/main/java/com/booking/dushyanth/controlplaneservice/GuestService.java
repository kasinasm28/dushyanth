package com.booking.dushyanth.controlplaneservice;

import com.booking.dushyanth.entity.Guest;
import com.booking.dushyanth.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GuestService {
    @Autowired
    private GuestRepository guestRepository;

    public List<Guest> findAllGuests() {
        return guestRepository.findAll();
    }

    public Guest findGuestById(Long id) {
        return guestRepository.findById(id).orElse(null);
    }

    public Guest saveGuest(Guest guest) {
        return guestRepository.save(guest);
    }
}