package com.team.springbatchuppercase.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "car_uppercase")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarTransformed {
    @Id
    @Column(name = "car_license_plate")
    private String licensePlate;

    @Column(name = "car_name")
    private String name;
}
