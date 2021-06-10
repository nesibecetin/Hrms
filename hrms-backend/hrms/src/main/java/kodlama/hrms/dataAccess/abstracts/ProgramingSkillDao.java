package kodlama.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrms.entities.concretes.ProgramingSkill;

public interface ProgramingSkillDao extends JpaRepository<ProgramingSkill,Integer>{

}
