package com.ust.DistrictService.service;

import com.ust.DistrictService.model.District;

import java.util.List;

public interface Districtservice {

    District addDistrict(District district);
    List<District> getDistricts(String statecode);

}
