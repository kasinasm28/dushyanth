package com.booking.dushyanth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "services")
@Data
public class Services {
    @Id
    private Long serviceId;
    private String serviceName;
    private String serviceDescription;
    private Double servicePrice;
}