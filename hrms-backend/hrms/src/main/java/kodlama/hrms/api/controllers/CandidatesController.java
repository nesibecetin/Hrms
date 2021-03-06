package kodlama.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.CandidateService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessDataResult;
import kodlama.hrms.entities.concretes.Candidate;
import kodlama.hrms.entities.dtos.ResumeDto;


@RestController
@RequestMapping("/api/candidates/")
@CrossOrigin
public class CandidatesController {
	
	private CandidateService candidateService;

	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("getall")
	public DataResult<List<Candidate>> getAll(){
		return this.candidateService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@Valid @RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}
	
	@GetMapping("getbyidentitynumber")
	public DataResult<Candidate> getByIdentityNumber(String identityNumber){
		return this.candidateService.getByIdentityNumber(identityNumber);
	}
	
	@GetMapping("getbyid")
	public DataResult<Candidate> getById(int id){
		return this.candidateService.getById(id);
	}
	
	@GetMapping("getresumebycandidateid")
	public DataResult<ResumeDto> getByResumeCandidateId(int id){
		return this.candidateService.getByResumeCandidateId(id);
	}

}
