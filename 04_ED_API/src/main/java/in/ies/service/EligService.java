package in.ies.service;

import java.util.List;

import in.ies.bindings.CoResponse;
import in.ies.bindings.EdResponse;

public interface EligService {

	
	public EdResponse determineEligibility(Long caseNum);
	
	public boolean generateCo(Long caseNum);
	
	
	
	
	
	
}
