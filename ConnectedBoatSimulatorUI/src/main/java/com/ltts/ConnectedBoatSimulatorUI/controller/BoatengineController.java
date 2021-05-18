package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatengine;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatengineService;

@Controller
public class BoatengineController {
	@Autowired
	private BoatengineService serviceEngine;
	
	@GetMapping("/boatenginelist")
	public String viewEngine(Model model) {
		List<Boatengine> li	 = serviceEngine.getAllBoatengine();
		model.addAttribute("boatenginelist", li);
		return "boatenginelist";
	}
	

}