package com.ust.DistrictService.service;


import com.ust.DistrictService.model.District;

import com.ust.DistrictService.repository.Districtrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictserviceImpl implements Districtservice{
    @Autowired
    private Districtrepo districtRepository;


    @Override
    public District addDistrict(District district) {
        return districtRepository.save(district);
    }



    @Override
    public List<District> getDistricts(String statecode) {
        return districtRepository.findByStatecode(statecode);
    }
}
