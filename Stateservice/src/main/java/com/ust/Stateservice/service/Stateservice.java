package com.ust.Stateservice.service;

import com.ust.Stateservice.dto.Districtdto;
import com.ust.Stateservice.dto.Fullresponse;
import com.ust.Stateservice.dto.Statedto;
import com.ust.Stateservice.model.State;
import com.ust.Stateservice.repo.Staterepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class Stateservice {

    @Autowired
    private Staterepo staterepo;

    @Autowired
    private WebClient webclient;


    public List<State> addStates(List<State> states) {
        return staterepo.saveAll(states);
    }


    public Fullresponse findallByStateCode(String statecode) {
        Fullresponse response=new Fullresponse();
        State state=staterepo.findByStatecode(statecode).orElseThrow(()->new RuntimeException("State not found"));
        Statedto s=mapToAirline(state);

        List<Districtdto> d=webclient.get()
                .uri("http://localhost:9876/district/getall/"+state.getStatecode())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Districtdto>>() {})
                .block();
        response.setStatecode(String.valueOf(state));
        response.setDistricts(d);

        return response;

    }
    public Statedto  mapToAirline(State state){
        Statedto dto=new Statedto();
        dto.setStatecode(state.getStatecode());
        dto.setStatename(state.getStatename());
        dto.setStatecm(state.getStatecm());
        dto.setStatecapital(state.getStatecapital());
        dto.setStatearea(state.getStatearea());
        return dto;
    }



}
