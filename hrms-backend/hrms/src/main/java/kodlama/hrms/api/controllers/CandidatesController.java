package kodlama.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.CandidateService;
import kodlama.hrms.entities.concretes.Candidate;


@RestController
@RequestMapping("/api/candidates/")
public class CandidatesController {
	
	private CandidateService candidateService;

	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("getall")
	public List<Candidate> getAll(){
		return this.candidateService.getAll();
	}
	
	@PostMapping("add")
	public Candidate add(@Valid @RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}

}