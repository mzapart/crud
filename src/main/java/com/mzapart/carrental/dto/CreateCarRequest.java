package com.mzapart.carrental.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

public class CreateCarRequest {

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	String name;
    String description;

    public CreateCarRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }
}


