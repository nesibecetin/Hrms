package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.JobAdvertisementService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessDataResult;
import kodlama.hrms.core.utilities.results.SuccessResult;
import kodlama.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlama.hrms.entities.concretes.JobAdvertisement;
import kodlama.hrms.entities.dtos.JobAdvertisementDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {

		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Listelendi.");
	}
	@Override
	public DataResult<List<JobAdvertisementDto>> getAllByIsActive() {
		
		return new SuccessDataResult<List<JobAdvertisementDto>>(this.jobAdvertisementDao.getAllByIsActive(),"listelendi.");
	}
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("eklendi.");
	}
	@Override
	public DataResult<List<JobAdvertisementDto>> getAllByIsActiveAndCompanyName(String companyName) {
		
		return new SuccessDataResult<List<JobAdvertisementDto>>(this.jobAdvertisementDao.getAllByIsActiveAndCompanyName(companyName));
	}
	@Override
	public DataResult<List<JobAdvertisementDto>> getAllByIsActiveAndEndDateDesc() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdvertisementDto>>(this.jobAdvertisementDao.getAllByIsActiveAndEndDateDesc());
	}
	

}
