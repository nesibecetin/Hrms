package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.entities.concretes.Language;

public interface LanguageService {
	Result add(Language language);
	DataResult<List<Language>> getAll();
	DataResult<List<Language>> getAllByCandidateId(int id);

}
