package kodlama.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.UserService;
import kodlama.hrms.core.entities.User;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessDataResult;

@RestController
@RequestMapping("/api/users/")
@CrossOrigin
public class UsersController {
	
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("add")
	public Result add(@Valid @RequestBody User user) {
		return this.userService.add(user);
	}
	
	@GetMapping("getall")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}
	@GetMapping("getbyemail")
	public DataResult<User> getByEmail(String email) {
		// TODO Auto-generated method stub
		return this.userService.getByEmail(email);
	}
	
	

}
