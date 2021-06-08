package kodlama.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.JobAdvertisementService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.entities.concretes.JobAdvertisement;
import kodlama.hrms.entities.dtos.JobAdvertisementDto;

@RestController
@RequestMapping("/api/jobadvertisements/")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	@GetMapping("getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
		
	}
	@GetMapping("getbyisactive")
	public DataResult<List<JobAdvertisementDto>> getByIsActive(){
		return this.jobAdvertisementService.getAllByIsActive();
	}
	
	

}
