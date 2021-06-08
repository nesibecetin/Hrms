package kodlama.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.*;

import kodlama.hrms.entities.concretes.JobAdvertisement;
import kodlama.hrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer>{
	
	@Query("Select new kodlama.hrms.entities.dtos.JobAdvertisementDto(e.companyName,p.name, j.numberOfPerson, j.startedDate, j.endDate) From JobAdvertisement j Inner Join j.employer e Inner join j.jobPosition p where j.isActive=true ")
	List<JobAdvertisementDto> getAllByIsActive();

}
