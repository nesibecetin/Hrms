package kodlama.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.ProgramingSkillService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessDataResult;
import kodlama.hrms.entities.concretes.ProgramingSkill;

@RequestMapping("/api/programingskill")
@RestController
@CrossOrigin
public class ProgramingSkillsController {

	private ProgramingSkillService programingSkillService;

	@Autowired
	public ProgramingSkillsController(ProgramingSkillService programingSkillService) {
		super();
		this.programingSkillService = programingSkillService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<ProgramingSkill>> getAll(){
		return this.programingSkillService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ProgramingSkill programingSkill) {
		return this.programingSkillService.add(programingSkill);
	}
	
	@GetMapping("/getallbycandidateid")
	public DataResult<List<ProgramingSkill>> getAllByCandidateId(int id) {
		// TODO Auto-generated method stub
		return this.programingSkillService.getAllByCandidateId(id);
	}
}
