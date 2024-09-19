package com.ust.Stateservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Districtdto {
    private int districtId;
    private String districtName;
    private String districtHeadquarter;
    private int districtPopulation;
    private String statecode;
}
