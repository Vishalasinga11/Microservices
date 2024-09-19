package com.ust.Stateservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class State {
    @Id
    private String statecode;
    private String statename;
    private String Statecm;
    private String statecapital;
    private String statearea;
}
