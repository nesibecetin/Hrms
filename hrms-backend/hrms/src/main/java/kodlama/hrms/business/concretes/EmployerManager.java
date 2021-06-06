package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.EmployerService;
import kodlama.hrms.dataAccess.abstracts.EmployerDao;
import kodlama.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAll() {
		// TODO Auto-generated method stub
		
		return this.employerDao.findAll();
	}

	@Override
	public Employer add(Employer employer) {
		// TODO Auto-generated method stub
		return this.employerDao.save(employer);
	}

}
