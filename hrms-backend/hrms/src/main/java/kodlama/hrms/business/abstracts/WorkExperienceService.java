package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.entities.concretes.WorkExperience;

public interface WorkExperienceService {
	Result add(WorkExperience workExperience);
	DataResult<List<WorkExperience>> getAll();

}
