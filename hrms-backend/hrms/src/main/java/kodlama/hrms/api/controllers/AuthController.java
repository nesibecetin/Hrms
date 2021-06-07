package kodlama.hrms.api.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.AuthService;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.entities.dtos.CandidateRegisterDto;
import kodlama.hrms.entities.dtos.EmployerRegisterDto;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	private AuthService authService;

	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	@PostMapping("/candidateregister")
	public Result CandidateRegister(@Valid @RequestBody CandidateRegisterDto candidateRegisterDto) {
		return this.authService.CandidateRegister(candidateRegisterDto);
	}
	
	@PostMapping("/employerregister")
	public Result EmployerRegister(@Valid @RequestBody EmployerRegisterDto employerRegisterDto){
		return this.authService.EmployerRegister(employerRegisterDto);
	}
	

}
