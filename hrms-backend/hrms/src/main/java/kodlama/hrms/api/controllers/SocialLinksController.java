package kodlama.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.SocialLinkService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.entities.concretes.SocialLink;

@RestController
@RequestMapping("/api/sociallink")
public class SocialLinksController {
	
	private SocialLinkService socialLinkService;
	
	@Autowired
	public SocialLinksController(SocialLinkService socialLinkService) {
		super();
		this.socialLinkService = socialLinkService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<SocialLink>> getAll(){
		return this.socialLinkService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SocialLink socialLink) {
		return this.socialLinkService.add(socialLink);
	}

}
