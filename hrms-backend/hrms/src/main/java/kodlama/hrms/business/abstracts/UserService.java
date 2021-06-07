package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.core.entities.User;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<List<User>> getAll();
	

}
