package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marketingapp.entities.Lead;
import com.marketingapp.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	LeadService leadService;
	
	@RequestMapping("/leadPageView")
	public String viewCreateLeadPage() {
		return "create_leads";
		
	}
	
	@RequestMapping(value = "/saveLead", method = RequestMethod.POST)
	public String saveOneLead(@ModelAttribute("leads") Lead l) {
		leadService.saveOneLead(l);
		return "create_leads";
		
	}
	
	@RequestMapping("/listAll")
	public String listAll(ModelMap model) {
		List<Lead> leads = leadService.listAllLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
		
	}

}
