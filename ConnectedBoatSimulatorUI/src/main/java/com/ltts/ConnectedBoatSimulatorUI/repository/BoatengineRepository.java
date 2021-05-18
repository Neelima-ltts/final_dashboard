package com.ltts.ConnectedBoatSimulatorUI.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatengine;

@Repository
public interface BoatengineRepository extends JpaRepository<Boatengine,Integer>{

}

