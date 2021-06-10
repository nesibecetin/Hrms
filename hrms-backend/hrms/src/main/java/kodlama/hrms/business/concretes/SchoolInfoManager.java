package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.SchoolInfoService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessDataResult;
import kodlama.hrms.core.utilities.results.SuccessResult;
import kodlama.hrms.dataAccess.abstracts.SchoolInfoDao;
import kodlama.hrms.entities.concretes.SchoolInfo;

@Service
public class SchoolInfoManager implements SchoolInfoService {

	private SchoolInfoDao schoolInfoDao;
	@Autowired
	public SchoolInfoManager(SchoolInfoDao schoolInfoDao) {
		super();
		this.schoolInfoDao = schoolInfoDao;
	}

	@Override
	public Result add(SchoolInfo schoolInfo) {
		this.schoolInfoDao.save(schoolInfo);
		return new SuccessResult("eklendi.");
	}

	@Override
	public DataResult<List<SchoolInfo>> getAll() {
		
		return new SuccessDataResult<List<SchoolInfo>>(this.schoolInfoDao.findAll());
	}

}
