package kodlama.hrms.business.verification.personalVerification;

import kodlama.hrms.core.utilities.results.Result;

public interface HrmsPersonalVerificationService {
	Result companyVerification(String email);

}
