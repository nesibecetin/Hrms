package kodlama.hrms.business.verification.mailVerification;

import org.springframework.stereotype.Service;

import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessResult;

@Service
public class MailVerificationManager implements MailVerificationService {

	@Override
	public Result sendMail(String email) {
	
		return new SuccessResult();
	}

}
