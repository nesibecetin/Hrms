package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.entities.concretes.JobAdvertisement;
import kodlama.hrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisementDto>> getAllByIsActive();
	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisementDto>> getAllByIsActiveAndCompanyName(String companyName);
	DataResult<List<JobAdvertisementDto>> getAllByIsActiveAndEndDateDesc();
}
