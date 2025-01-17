package com.ust.DistrictService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="district")
public class District {
    @Id
    private Long districtId;
    private String districtName;
    private String districtHeadquarter;
    private int districtPopulation;
    private String statecode;
}
