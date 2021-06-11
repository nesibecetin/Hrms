package kodlama.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.hrms.entities.concretes.WorkExperience;

public interface WorkExperienceDao extends JpaRepository<WorkExperience,Integer>{
	
	@Query("From WorkExperience e where candidate_id=:id order by e.endDate Desc")
	List<WorkExperience> getAllByCandidateId(int id);

}
