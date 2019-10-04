package com.example.spot.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private String streetName;
    private String streetNumber;
    private String country;
    private String county;
    private String state;
    private String zipCode;
}
