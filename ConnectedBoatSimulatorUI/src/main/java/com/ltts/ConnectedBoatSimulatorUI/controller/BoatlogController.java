package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatlog;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatlogService;

@Controller
public class BoatlogController {
	@Autowired
	private BoatlogService serviceLog;
	
	@GetMapping("/boatloglist")
	public String viewEngine(Model model) {
		List<Boatlog> li1 = serviceLog.getAllBoatlog();
		model.addAttribute("boatloglist", li1);
		return "boatloglist";
	}
	
}
