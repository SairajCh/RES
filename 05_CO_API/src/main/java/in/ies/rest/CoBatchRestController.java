package in.ies.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import in.ies.binding.CoResponse;
import in.ies.service.CoService;

public class CoBatchRestController {
	
	@Autowired
	private CoService service;
	
	@GetMapping("/process")
	public CoResponse processTriggers() throws Exception {
		
		return null;

		
	}

}
