package com.ltts.ConnectedBoatSimulatorUI.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatlog;

@Repository
public interface BoatlogRepository extends JpaRepository<Boatlog,Integer>{

}

