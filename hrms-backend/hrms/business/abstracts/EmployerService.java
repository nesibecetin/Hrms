package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
	Employer add(Employer employer);
}
