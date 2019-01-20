package com.mzapart.carrental.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CarDto {
    private String id;
    private String name;
    private String description;

    public CarDto(String carId, String carName, String carDescription) {
        id = carId;
        name = carName;
        description = carDescription;
    }
}
