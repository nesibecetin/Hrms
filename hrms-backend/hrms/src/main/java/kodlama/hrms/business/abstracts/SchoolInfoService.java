package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.entities.concretes.SchoolInfo;

public interface SchoolInfoService {
	Result add(SchoolInfo schoolInfo);
	DataResult<List<SchoolInfo>> getAll();

}
