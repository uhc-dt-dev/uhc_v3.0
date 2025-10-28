package com.uhc.station.branch.entity;

import org.hibernate.annotations.DynamicUpdate;

import com.uhc.station.branch.enums.Brand;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@DynamicUpdate
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "branches")
@Entity
public class Branch {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "brand", nullable = false)
    private Brand brand;

    @Column(name = "country_code", nullable = false)
    private int countryCode;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "display_order")
    private int displayOrder;

    @Column(name = "has_visible")
    private boolean hasVisible;

    @Column(name = "has_deleted")
    private boolean hasDeleted;
}
