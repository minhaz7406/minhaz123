package com.marketingapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.entities.Lead;
import com.marketingapp.repository.LeadRepository;

@Service
public class LeadServiceImple implements LeadService {
	
	@Autowired
	LeadRepository leadRepo;

	@Override
	public void saveOneLead(Lead l) {
		leadRepo.save(l);
		
	}

	@Override
	public List<Lead> listAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
		
	}

	
}
