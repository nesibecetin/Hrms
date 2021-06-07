package kodlama.hrms.business.verification.mailVerification;

import kodlama.hrms.core.utilities.results.Result;

public interface MailVerificationService {
	Result sendMail(String email);

}
