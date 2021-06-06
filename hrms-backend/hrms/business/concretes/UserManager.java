package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.UserService;
import kodlama.hrms.core.entities.User;
import kodlama.hrms.dataAccess.abstracts.UserDao;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public User add(User user) {
		// TODO Auto-generated method stub
		return this.userDao.save(user);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

}
