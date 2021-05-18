package com.ltts.ConnectedBoatSimulatorUI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatsensor;

@Repository
public interface BoatsensorRepository extends JpaRepository<Boatsensor,Integer>{

}

