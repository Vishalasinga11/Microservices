package com.ust.Stateservice.controller;

import com.ust.Stateservice.dto.Districtdto;
import com.ust.Stateservice.dto.Fullresponse;
import com.ust.Stateservice.model.State;
import com.ust.Stateservice.service.Stateservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/state")
public class StateController {

    @Autowired
    private Stateservice stateservice;

    @PostMapping("/addStates")
    public List<State> addStates(@RequestBody List<State> states){
        return stateservice.addStates(states);
    }

    @GetMapping("/getall/{statecode}")
    public Fullresponse findallByStateCode(@PathVariable("statecode") String statecode){
        return stateservice.findallByStateCode(statecode);
    }



}
