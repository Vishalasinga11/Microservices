package com.ust.DistrictService.controller;




import com.ust.DistrictService.model.District;
import com.ust.DistrictService.repository.Districtrepo;
import com.ust.DistrictService.service.DistrictserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/district")
public class Districtcontroller {

    @Autowired
    private DistrictserviceImpl districtService;

    @Autowired
    private Districtrepo districtrepo;

    @PostMapping("/adddist")
    public District addDistrict(@RequestBody District district){
        return districtService.addDistrict(district);
    }

    @GetMapping("/getall/{statecode}")
    public List<District> addState(@PathVariable String statecode){
        return districtService.getDistricts(statecode);

    }
    @GetMapping("/fetch")
    public List<District> fetch(){
        return districtrepo.findAll();
    }
}
