package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.JobPositionService;
import kodlama.hrms.core.utilities.business.BusinessRules;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.ErrorResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessDataResult;
import kodlama.hrms.core.utilities.results.SuccessResult;
import kodlama.hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}
	@Override
	public DataResult<List<JobPosition>> getAll() {

		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Listelendi.");
	}
	@Override
	public Result add(JobPosition jobPosition) {
		var result=BusinessRules.run(checkIfJobPositionExist(jobPosition.getName()));
		if(result!=null) {
			return result;
		}
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("eklendi");
	}
	@Override
	public DataResult<JobPosition> getByName(String name) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.getByName(name),"listelendi.");
	}
	
	private Result checkIfJobPositionExist(String name) {
		var result=this.getByName(name);
		if(result.getData()==null) {
			return new SuccessResult();
		}
		return new ErrorResult("bu pozisyon zaten var");
		
	}

}
