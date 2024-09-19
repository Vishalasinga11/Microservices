package com.ust.DistrictService.repository;


import com.ust.DistrictService.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Districtrepo extends JpaRepository<District,Long> {

    List<District> findByStatecode(String statecode);
}
