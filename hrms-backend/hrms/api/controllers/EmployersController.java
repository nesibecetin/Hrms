package kodlama.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.EmployerService;
import kodlama.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers/")
public class EmployersController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("getall")
	public List<Employer> getAll(){
		return this.employerService.getAll();	 
		
	}
	
	@PostMapping("add")
	public Employer add(@Valid @RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
	
	
	

}
