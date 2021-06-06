package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.core.entities.User;

public interface UserService {
	User add(User user);
	List<User> getAll();
	

}
