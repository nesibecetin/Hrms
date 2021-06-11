package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.ProgramingSkillService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessDataResult;
import kodlama.hrms.core.utilities.results.SuccessResult;
import kodlama.hrms.dataAccess.abstracts.ProgramingSkillDao;
import kodlama.hrms.entities.concretes.ProgramingSkill;
@Service
public class ProgramingSkillManager implements ProgramingSkillService {

	private ProgramingSkillDao programingSkillDao;
	@Autowired
	public ProgramingSkillManager(ProgramingSkillDao programingSkillDao) {
		super();
		this.programingSkillDao = programingSkillDao;
	}

	@Override
	public Result add(ProgramingSkill programingSkill) {
		this.programingSkillDao.save(programingSkill);
		return new SuccessResult("eklendi");
	}

	@Override
	public DataResult<List<ProgramingSkill>> getAll() {
		
		return new SuccessDataResult<List<ProgramingSkill>>(this.programingSkillDao.findAll(),"listelendi");
	}

	@Override
	public DataResult<List<ProgramingSkill>> getAllByCandidateId(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ProgramingSkill>>(this.programingSkillDao.getAllByCandidateId(id),"listelendi");
	}

}
