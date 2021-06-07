package kodlama.hrms.entities.dtos;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerRegisterDto {

	@NotBlank
	@NotNull(message = "website adress may not be blank")
	private String webSiteAdress;
	
	@NotBlank
	@NotNull(message = "company name may not be blank")
	private String companyName;
	
	@NotBlank
	@NotNull(message = "phone number may not be blank")
	@Pattern(regexp ="[0-9\\s]{12}")
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Email
	@NotBlank
	@NotNull(message = "Email may not be blank")
	private String email;
	
	@NotBlank
	@NotNull(message = "Password may not be blank")
	@Size(min=6,max=12)
	private String password;
}
