package kodlama.hrms.core.adapters.mernis;

import org.springframework.stereotype.Service;

@Service
public class MernisVerificationManager implements MernisVerificationService{


	@Override
	public boolean checkUser(String natinalityId, int birthOfDate) {
		if(natinalityId.length()==11 && birthOfDate>=1900)
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}
