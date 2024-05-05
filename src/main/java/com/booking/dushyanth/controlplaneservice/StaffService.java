package com.booking.dushyanth.controlplaneservice;


import com.booking.dushyanth.entity.Staff;
import com.booking.dushyanth.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffRepository staffRepository;

    public List<Staff> findAllStaff() {
        return staffRepository.findAll();
    }

    public Staff findStaffById(Long id) {
        return staffRepository.findById(id).orElse(null);
    }

    public Staff saveStaff(Staff staff) {
        return staffRepository.save(staff);
    }
}
