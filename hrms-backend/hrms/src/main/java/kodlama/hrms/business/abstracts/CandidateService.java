package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.entities.concretes.Candidate;
import kodlama.hrms.entities.dtos.ResumeDto;

public interface CandidateService {
	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidate);
	DataResult<Candidate> getByIdentityNumber(String identityNumber);
	DataResult<Candidate> getById(int id);
	DataResult<ResumeDto> getByResumeCandidateId(int id);
	

}
