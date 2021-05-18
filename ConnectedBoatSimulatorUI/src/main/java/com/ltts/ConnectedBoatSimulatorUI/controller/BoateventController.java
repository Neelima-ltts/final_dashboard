package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatevent;
import com.ltts.ConnectedBoatSimulatorUI.service.BoateventService;

@Controller
public class BoateventController {
	@Autowired
	private BoateventService serviceEvent;
	
	@GetMapping("/boateventlist")
	public String viewEngine(Model model) {
		List<Boatevent> li2 = serviceEvent.getAllBoatevent();
		model.addAttribute("boateventlist", li2);
		return "boateventlist";
	}
	
}