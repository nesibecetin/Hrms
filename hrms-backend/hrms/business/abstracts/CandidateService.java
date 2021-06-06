package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.entities.concretes.Candidate;

public interface CandidateService {
	List<Candidate> getAll();
	Candidate add(Candidate candidate);

}
