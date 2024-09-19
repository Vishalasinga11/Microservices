package com.ust.Stateservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Fullresponse {
    public String statecode;
    public List<Districtdto> districts;
}
