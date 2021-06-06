package kodlama.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.UserService;
import kodlama.hrms.core.entities.User;

@RestController
@RequestMapping("/api/users/")
public class UsersController {
	
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("add")
	public User add(@Valid @RequestBody User user) {
		return this.userService.add(user);
	}
	
	@GetMapping("getall")
	public List<User> getAll(){
		return this.userService.getAll();
	}
	
	

}
