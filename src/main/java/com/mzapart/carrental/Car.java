package com.mzapart.carrental;

import org.springframework.boot.SpringApplication;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mzapart.carrental.dto.CarDto;

@SpringBootApplication
@Getter
@Setter
@NoArgsConstructor
@Entity
class Car {
	 @Id
	 private String id;
	 private String name;
	 private String description;

	public Car(String carId, String carName, String carDescription) {
	    id = carId;
	    name = carName;
	    description = carDescription;
	}
    public CarDto snapshot() {
        return new CarDto(id, name, description);
    }
}
