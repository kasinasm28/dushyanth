package com.booking.dushyanth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "rooms")
@Data  // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
public class Room {
    @Id
    private Long roomId;
    private String roomNumber;
    private String status;
    private String roomType;
    private Double pricePerNight;
}