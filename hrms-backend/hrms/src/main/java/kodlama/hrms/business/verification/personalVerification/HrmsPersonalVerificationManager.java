package kodlama.hrms.business.verification.personalVerification;

import org.springframework.stereotype.Service;

import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessResult;

@Service
public class HrmsPersonalVerificationManager implements HrmsPersonalVerificationService {

	@Override
	public Result companyVerification(String email) {
		
		return new SuccessResult();
	}

}
