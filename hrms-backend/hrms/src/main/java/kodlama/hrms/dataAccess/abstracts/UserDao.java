package kodlama.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrms.core.entities.User;

public interface UserDao extends JpaRepository<User,Integer> {

	User getByEmail(String email);
}
