package kodlama.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {

	private String companyName;
	private String positionName;	
	private int numberOfPerson;
	private Date startedDate;
	private Date endDate;
	
}
