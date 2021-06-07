package kodlama.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name="job_positions")
@Data
public class JobPosition {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@NotBlank
	@NotNull(message="name doesn't exist")
	@Size(min=3,max=30)
	@Column(name="name")
	private String name;
	
	public JobPosition() {
		super();
	}
	
	public JobPosition(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
}

