package kodlama.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_advertisements")
public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
//	@Column(name="city_id")
//	private int cityId;

	@Column(name="description")
	private String description;
	
//	@Column(name="position_id")
//	private int positionId;
	
	@Column(name="min")
	private String min;
	
	@Column(name="max")
	private String max;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="number_of_persons")
	private int numberOfPerson;
	
	@Column(name="started_date")
	private Date startedDate;
	
	@Column(name="end_date")
	private Date endDate;
	
//	@Column(name="employer_id")
//	private int employerId;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name="position_id")
	private JobPosition jobPosition;
	

}
