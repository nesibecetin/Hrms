package kodlama.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.hrms.entities.concretes.SchoolInfo;

public interface SchoolInfoDao extends JpaRepository<SchoolInfo,Integer>{

	@Query("From SchoolInfo s where candidate_id=:id order by s.graduateDate Desc")
	List<SchoolInfo> getAllByCandidateId(int id);
}
