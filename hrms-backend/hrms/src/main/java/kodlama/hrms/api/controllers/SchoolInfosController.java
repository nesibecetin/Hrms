package kodlama.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.SchoolInfoService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.entities.concretes.SchoolInfo;

@RestController
@RequestMapping("/api/schoolinfo")
public class SchoolInfosController {

	private SchoolInfoService schoolInfoService;

	@Autowired
	public SchoolInfosController(SchoolInfoService schoolInfoService) {
		super();
		this.schoolInfoService = schoolInfoService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<SchoolInfo>> getAll(){
		return this.schoolInfoService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SchoolInfo schoolInfo) {
		return this.schoolInfoService.add(schoolInfo);
	}
}
