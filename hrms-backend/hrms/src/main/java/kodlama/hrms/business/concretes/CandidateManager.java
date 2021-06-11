package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.CandidateService;
import kodlama.hrms.business.abstracts.CoverLetterService;
import kodlama.hrms.business.abstracts.LanguageService;
import kodlama.hrms.business.abstracts.ProgramingSkillService;
import kodlama.hrms.business.abstracts.SchoolInfoService;
import kodlama.hrms.business.abstracts.SocialLinkService;
import kodlama.hrms.business.abstracts.WorkExperienceService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.Result;
import kodlama.hrms.core.utilities.results.SuccessDataResult;
import kodlama.hrms.core.utilities.results.SuccessResult;
import kodlama.hrms.dataAccess.abstracts.CandidateDao;
import kodlama.hrms.entities.concretes.Candidate;
import kodlama.hrms.entities.dtos.ResumeDto;

@Service
public class CandidateManager implements CandidateService {
	
	private CandidateDao candidateDao;
	private LanguageService languageService;
	private SocialLinkService socialLinkService;
	private ProgramingSkillService programingSkillService;
	private SchoolInfoService schoolInfoService;
	private WorkExperienceService workExperienceService;
	private CoverLetterService coverLetterService;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, LanguageService languageService,
			SocialLinkService socialLinkService, ProgramingSkillService programingSkillService,
			SchoolInfoService schoolInfoService, WorkExperienceService workExperienceService,
			CoverLetterService coverLetterService) {
		super();
		this.candidateDao = candidateDao;
		this.languageService = languageService;
		this.socialLinkService = socialLinkService;
		this.programingSkillService = programingSkillService;
		this.schoolInfoService = schoolInfoService;
		this.workExperienceService = workExperienceService;
		this.coverLetterService = coverLetterService;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Listelendi.");
				
	}

	@Override
	public Result add(Candidate candidate) {
		
		this.candidateDao.save(candidate);
		return new SuccessResult("eklendi.");
	}

	@Override
	public DataResult<Candidate> getByIdentityNumber(String identityNumber) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Candidate>(this.candidateDao.getByIdentityNumber(identityNumber));
	}

	@Override
	public DataResult<Candidate> getById(int id) {
		
		return new SuccessDataResult<Candidate>(this.candidateDao.getAllById(id));
	}

	@Override
	public DataResult<ResumeDto> getByResumeCandidateId(int id) {
		ResumeDto resume=new ResumeDto();
		resume.setCandidate(this.getById(id).getData());
		resume.setCoverLetters(this.coverLetterService.getAllByCandidateId(id).getData());
		resume.setLanguages(this.languageService.getAllByCandidateId(id).getData());
		resume.setProgramingSkills(this.programingSkillService.getAllByCandidateId(id).getData());
		resume.setSchoolInfos(this.schoolInfoService.getAllByCandidateId(id).getData());
		resume.setSocialLinks(this.socialLinkService.getByCandidatesId(id).getData());
		resume.setWorkExperiencea(this.workExperienceService.getAllByCandidateId(id).getData());
		return new SuccessDataResult<ResumeDto>(resume,"listelendi.");
	}
	
}
