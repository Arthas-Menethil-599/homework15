package org.itstep.homework15.db.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

    private Long id;

    private String model;

    private String brand;

    private Double engineVolume;

    private Integer price;
}
