package com.ltts.ConnectedBoatSimulatorUI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatevent;

@Repository
public interface BoateventRepository extends JpaRepository<Boatevent,Integer>{

}
