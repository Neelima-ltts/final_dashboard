package com.ltts.ConnectedBoatSimulatorUI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatessentials;

@Repository
public interface BoatessentialsRepository extends JpaRepository<Boatessentials,Integer>{

}
