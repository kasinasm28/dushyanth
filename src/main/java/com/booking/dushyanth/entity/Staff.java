package com.booking.dushyanth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "staff")
@Data
public class Staff {
    @Id
    private Long staffId;
    private String email;
    private String phone;
}