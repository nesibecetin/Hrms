package kodlama.hrms.entities.dtos;


import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateRegisterDto {

	@NotBlank
	@NotNull(message = "firstname may not be blank")
	private String firstName;
	
	@NotBlank
	@NotNull(message = "lastName may not be blank")
	private String lastName;
	
	@NotNull(message = "birth Of Year may not be blank")
	@Column(name="birth_of_year")
	private int birthOfYear;
	
	@NotBlank
	@NotNull(message = "identity number may not be blank")
	private String identityNumber;
	
	@Email
	@NotBlank
	@NotNull(message = "Email may not be blank")
	private String email;
	
	@NotBlank
	@NotNull(message = "Password may not be blank")
	@Size(min=6,max=12)
	private String password;
}
