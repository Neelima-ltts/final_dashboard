	package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatvehicle;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatengine;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatessentials;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatevent;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatsensor;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatlocation;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatlog;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatengineService;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatessentialsService;
import com.ltts.ConnectedBoatSimulatorUI.service.BoateventService;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatlocationService;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatlogService;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatsensorService;

@Controller
public class BoatessentialsController {
	@Autowired
	private BoatessentialsService serviceEssentials;
	@Autowired
	private BoatlocationService serviceLocation;
	@Autowired
	private BoateventService serviceEvent;
	@Autowired
	private BoatengineService serviceEngine;
	@Autowired
	private BoatlogService serviceLog;
	@Autowired
	private BoatsensorService serviceSensor;

	
	@GetMapping("/")
	public String viewEngine(Model model) {
		List<Boatessentials> li1 = serviceEssentials.getAllBoatessentials();
		model.addAttribute("boatessentialslist", li1);
		return "boatessentialslist";
	}
	
	@RequestMapping("/boatenginelist")
	public ModelAndView firstMethod() {
		return new ModelAndView("boatenginelist");
	}	
	
	
	@RequestMapping("/boatessentialslist")
	public ModelAndView secondMethod() {
		return new ModelAndView("boatessentialslist");
	}	
	
	@RequestMapping("/boateventlist")
	public ModelAndView thirdMethod() {
		return new ModelAndView("boateventlist");
	}	
	@RequestMapping("/boatlocationlist")
	public ModelAndView fourthMethod() {
		return new ModelAndView("boatlocationlist");
	}	
	@RequestMapping("/boatloglist")
	public ModelAndView fivthMethod() {
		return new ModelAndView("boatloglist");
	}	
	
	
	
	@GetMapping("/location")
	public String viewMain(Model model) {
		List<Boatlocation> li = serviceLocation.getAllBoatlocation();
		model.addAttribute("boatessentialslist", li);
		System.out.println(li);
		//Main m=li.get(1);
		//System.out.println(li.size());
		//System.out.println(m);
		return "boatessentialslist";
	}
	
	
	
}


