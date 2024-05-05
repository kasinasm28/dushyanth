package com.booking.dushyanth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "guests")
@Data  // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
public class Guest {
    @Id
    private Long guestId;
    private String email;
    private String phone;
}