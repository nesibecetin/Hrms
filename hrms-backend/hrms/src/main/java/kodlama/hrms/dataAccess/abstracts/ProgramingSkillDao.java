package kodlama.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrms.entities.concretes.ProgramingSkill;

public interface ProgramingSkillDao extends JpaRepository<ProgramingSkill,Integer>{

	List<ProgramingSkill> getAllByCandidateId(int id);
}
