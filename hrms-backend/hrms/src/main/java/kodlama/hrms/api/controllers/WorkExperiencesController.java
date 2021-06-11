package kodlama.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.WorkExperienceService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessDataResult;
import kodlama.hrms.entities.concretes.WorkExperience;

@RequestMapping("/api/workexperience")
@RestController
public class WorkExperiencesController {
	
	private WorkExperienceService workExperienceService;
	@Autowired
		public WorkExperiencesController(WorkExperienceService workExperienceService) {
		super();
		this.workExperienceService = workExperienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody WorkExperience workExperience){
		return this.workExperienceService.add(workExperience);
	}
	@GetMapping("/getAll")
	public DataResult<List<WorkExperience>> getAll(){
		return this.workExperienceService.getAll();
	}
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<WorkExperience>> getAllByCandidateId(int id) {
		
		return this.workExperienceService.getAllByCandidateId(id);
	}
		

	

}
