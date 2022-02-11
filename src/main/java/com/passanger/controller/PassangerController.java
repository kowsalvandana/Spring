package com.passanger.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.passanger.model.PasangerModel;
import com.passanger.service.PassangerService;


@Controller
@RequestMapping("/passanger")
public class PassangerController {
	
	@Autowired
	private PassangerService service;
	
	@GetMapping("/reg")
	public String loadFrom(Model model) {
		model.addAttribute("passanger", new PasangerModel());
	    return "reg";
	}
	@PostMapping("/save")
	public String savepassanger(PasangerModel passanger, Model model) {
		Integer id=service.savepassanger(passanger);
		model.addAttribute("passanger", new PasangerModel());
	return "reg";
	}
	@GetMapping("/all")
	public String showAll(Model model) {
		List<PasangerModel> list = service.getAllPassangerDetails();
		model.addAttribute("list", list );
		return "data";
		
	}
	 /*@GetMapping("/search")
		public String getOne(@RequestParam Integer id, Model model)throws Exception{
			
			PasangerModel p=service.getOnePassanger(id);

			model.addAttribute("obj",p);
				return "view";

			}*/
	
	 @GetMapping("/delete")
	 public String deletePassanger(@RequestParam Integer id, Model map) {
	 	service.deletePassanger(id);
	 	//map.addAttribute("l",service.getAllLicHolders());
	     //map.addAttribute("l",service.getAllLicHolders());
	 	//map.addAttribute("l", "Lic '"+policynumber+"' Updated");
	 	return "redirect:all";
	 }
}
