package com.marketingapp.services;

import java.util.List;

import com.marketingapp.entities.Lead;

public interface LeadService {
	public void saveOneLead(Lead l);
	public List<Lead> listAllLeads();
	

}
