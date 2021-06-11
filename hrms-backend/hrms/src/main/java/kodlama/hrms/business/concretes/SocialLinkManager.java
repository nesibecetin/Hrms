package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.SocialLinkService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessDataResult;
import kodlama.hrms.core.utilities.results.SuccessResult;
import kodlama.hrms.dataAccess.abstracts.SocialLinkDao;
import kodlama.hrms.entities.concretes.SocialLink;

@Service
public class SocialLinkManager implements SocialLinkService{

	private SocialLinkDao socialLinkDao;
	@Autowired
	public SocialLinkManager(SocialLinkDao socialLinkDao) {
		super();
		this.socialLinkDao = socialLinkDao;
	}

	@Override
	public Result add(SocialLink socialLink) {
		this.socialLinkDao.save(socialLink);
		return new SuccessResult("eklendi.");
	}

	@Override
	public DataResult<List<SocialLink>> getAll() {
		
		return new SuccessDataResult<List<SocialLink>>(this.socialLinkDao.findAll());
	}

	@Override
	public DataResult<List<SocialLink>> getByCandidatesId(int candidateId) {
		
		return new SuccessDataResult<List<SocialLink>>(this.socialLinkDao.getAllByCandidateId(candidateId));
	}

}
