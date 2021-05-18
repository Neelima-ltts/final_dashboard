package com.ltts.ConnectedBoatSimulatorUI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatlocation;

@Repository
public interface BoatlocationRepository extends JpaRepository<Boatlocation,Integer>{

}
