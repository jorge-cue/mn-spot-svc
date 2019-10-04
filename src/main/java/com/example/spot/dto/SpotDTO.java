package com.example.spot.dto;

import lombok.Data;

import java.util.List;

@Data
public class SpotDTO {
    private String id;
    private String title;
    private AddressDTO address;
    private List<ContactDTO> contactInfo;
}
