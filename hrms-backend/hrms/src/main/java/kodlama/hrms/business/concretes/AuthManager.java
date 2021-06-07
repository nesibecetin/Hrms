package kodlama.hrms.business.concretes;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.AuthService;
import kodlama.hrms.business.abstracts.CandidateService;
import kodlama.hrms.business.abstracts.EmployerService;
import kodlama.hrms.business.abstracts.UserService;
import kodlama.hrms.business.verification.mailVerification.MailVerificationService;
import kodlama.hrms.business.verification.personalVerification.HrmsPersonalVerificationService;
import kodlama.hrms.core.adapters.mernis.MernisVerificationService;
import kodlama.hrms.core.utilities.business.BusinessRules;
import kodlama.hrms.core.utilities.results.ErrorResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessResult;
import kodlama.hrms.entities.concretes.Candidate;
import kodlama.hrms.entities.concretes.Employer;
import kodlama.hrms.entities.dtos.CandidateRegisterDto;
import kodlama.hrms.entities.dtos.EmployerRegisterDto;

@Service
public class AuthManager implements AuthService {

	private MailVerificationService mailVerificationService;
	private HrmsPersonalVerificationService hrmsPersonalVerificationService;
	private MernisVerificationService mernisVerificationService;
	private CandidateService candidateService;
	private EmployerService employerService;
	private ModelMapper modelMapper;
	private UserService userService;
	
	@Autowired
	public AuthManager(MailVerificationService mailVerificationService,
			HrmsPersonalVerificationService hrmsPersonalVerificationService,
			MernisVerificationService mernisVerificationService, CandidateService candidateService,
			EmployerService employerService,ModelMapper modelMapper, UserService userService) {
		super();
		this.mailVerificationService = mailVerificationService;
		this.hrmsPersonalVerificationService = hrmsPersonalVerificationService;
		this.mernisVerificationService = mernisVerificationService;
		this.candidateService = candidateService;
		this.employerService = employerService;
		this.modelMapper=modelMapper;
		this.userService=userService;
	}

	
	
	@Override
	public Result CandidateRegister(CandidateRegisterDto candidateRegisterDto) {
		
		var result = BusinessRules.run(checkRealUser(candidateRegisterDto.getIdentityNumber(),candidateRegisterDto.getBirthOfYear()),
				verifyEmail(candidateRegisterDto.getEmail()),checkEmailExist(candidateRegisterDto.getEmail()),
				checkIfIdentityNumberExist(candidateRegisterDto.getIdentityNumber()));
		if(result!=null) {
			
			return result;		
		}
		Candidate candidate = modelMapper.map(candidateRegisterDto, Candidate.class);
		this.candidateService.add(candidate);
		
		return new SuccessResult("eklendi.");
		
	}

	@Override
	public Result EmployerRegister(EmployerRegisterDto employerRegisterDto) {

		var result =BusinessRules.run(checkEmailExist(employerRegisterDto.getEmail()),
				checkHrmsPersonnelVerification(employerRegisterDto.getEmail()),verifyEmail(employerRegisterDto.getEmail()));
		if(result!=null) {
			return result;
		}
		Employer employer=modelMapper.map(employerRegisterDto,Employer.class);
		this.employerService.add(employer);
		return new SuccessResult("eklendi.");
	}
	
	private Result  checkRealUser(String nationalityId,int birthOfYear) {
		var result = this.mernisVerificationService.checkUser(nationalityId, birthOfYear);
		if(result==true) {
			return new SuccessResult();
			
		}
		return new ErrorResult("Kullanıcı Geçersiz.");
		
	}
	
	private Result  verifyEmail(String email) {
		Result result = this.mailVerificationService.sendMail(email);
		if(result!=null) {
			return new SuccessResult();
		}
		return new ErrorResult("Kullanıcı Geçersiz.");
	}
	
	private Result checkEmailExist(String email) {
		var result=this.userService.getByEmail(email);
		if(result.getData()==null) {
			return new SuccessResult();	
			
		}
		return new ErrorResult("email zaten var");
	}
	
	private Result checkIfIdentityNumberExist(String identityNumber)
	{
		var result= this.candidateService.getByIdentityNumber(identityNumber);
		if(result.getData()==null) {
			return new SuccessResult();
		}
		return new ErrorResult("identity number zaten var.");
		
	}
	
	private Result checkHrmsPersonnelVerification(String email) {
		Result result = this.hrmsPersonalVerificationService.companyVerification(email);
		if(result!=null) {
			return new SuccessResult();
			
		}
		return new ErrorResult("Doğrulama Yapılamadı.");
	}
	
	

}
