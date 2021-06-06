package kodlama.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import kodlama.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidates")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id",referencedColumnName = "id")
public class Candidate extends User {
	
	@NotBlank
	@NotNull(message = "firstname may not be blank")
	@Column(name="firstname")
	private String firstName;
	
	@NotBlank
	@NotNull(message = "lastName may not be blank")
	@Column(name="lastname")
	private String lastName;
	
	@NotNull(message = "birth Of Year may not be blank")
	@Column(name="birth_of_year")
	private int birthOfYear;
	
	@NotBlank
	@NotNull(message = "identity number may not be blank")
	@Column(name="identity_number")
	private String identityNumber;

}