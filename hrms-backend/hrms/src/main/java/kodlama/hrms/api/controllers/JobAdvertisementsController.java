package kodlama.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.JobAdvertisementService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.entities.concretes.JobAdvertisement;
import kodlama.hrms.entities.dtos.JobAdvertisementDto;

@RestController
@RequestMapping("/api/jobadvertisements/")
@CrossOrigin
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
	
	@PostMapping("add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("getAllByIsActiveAndCompanyName")
	public DataResult<List<JobAdvertisementDto>> getAllByIsActiveAndCompanyName(String companyName) {
		return this.jobAdvertisementService.getAllByIsActiveAndCompanyName(companyName);
	}
	
	@GetMapping("getAllByIsActiveAndEndDateDesc")
	public DataResult<List<JobAdvertisementDto>> getAllByIsActiveAndEndDateDesc() {
		return this.jobAdvertisementService.getAllByIsActiveAndEndDateDesc();
	}
	
	@GetMapping("/closeJobAdvertisment")
	public Result closeJobAdvertisment(@RequestParam int id)
	{
		return this.jobAdvertisementService.closeActiceAdvertisement(id);
	}
	

}
