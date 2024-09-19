package com.ust.Stateservice.repo;

import com.ust.Stateservice.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Staterepo extends JpaRepository<State,String> {
    Optional<State> findByStatecode(String statecode);
}
