package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.entities.concretes.SocialLink;

public interface SocialLinkService {
	Result add(SocialLink socialLink);
	DataResult<List<SocialLink>> getAll();
	DataResult<List<SocialLink>> getByCandidatesId(int candidateId);

}
