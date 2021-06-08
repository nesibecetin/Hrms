package kodlama.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlama.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employers")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id",referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handle","jobAdvertisement"})
public class Employer extends User {
	
	@NotBlank
	@NotNull(message = "website adress may not be blank")
	@Column(name="website_adress")
	private String webSiteAdress;
	
	@NotBlank
	@NotNull(message = "company name may not be blank")
	@Column(name="company_name")
	private String companyName;
	
	@NotBlank
	@NotNull(message = "phone number may not be blank")
	@Pattern(regexp ="[0-9\\s]{12}")
	@Column(name="phone_number")
	private String phoneNumber;
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisement;
	

}
