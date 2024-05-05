package com.booking.dushyanth.headend;


import com.booking.dushyanth.controlplaneservice.GuestService;
import com.booking.dushyanth.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guests")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @GetMapping
    public List<Guest> getAllGuests() {
        return guestService.findAllGuests();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Guest> getGuestById(@PathVariable Long id) {
        Guest guest = guestService.findGuestById(id);
        if (guest != null) {
            return ResponseEntity.ok(guest);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Guest createGuest(@RequestBody Guest guest) {
        return guestService.saveGuest(guest);
    }
}
