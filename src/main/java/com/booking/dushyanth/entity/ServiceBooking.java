package com.booking.dushyanth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Table(name = "service_booking")
@Data
public class ServiceBooking {
    @Id
    private Long serviceBookingId;

    @ManyToOne
    @JoinColumn(name = "bookingId", nullable = false)
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "serviceId", nullable = false)
    private Services service;

    private String serviceDate;
    private String serviceTime;
    private String status;
}