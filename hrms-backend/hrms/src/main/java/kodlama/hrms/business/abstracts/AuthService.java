package kodlama.hrms.business.abstracts;

import org.springframework.stereotype.Service;

import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.entities.dtos.CandidateRegisterDto;
import kodlama.hrms.entities.dtos.EmployerRegisterDto;

@Service
public interface AuthService {
	Result CandidateRegister(CandidateRegisterDto candidateRegisterDto);
	Result EmployerRegister(EmployerRegisterDto employerRegisterDto);

}
