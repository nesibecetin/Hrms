package kodlama.hrms.entities.dtos;

import java.util.List;

import kodlama.hrms.entities.concretes.Candidate;
import kodlama.hrms.entities.concretes.CoverLetter;
import kodlama.hrms.entities.concretes.Language;
import kodlama.hrms.entities.concretes.ProgramingSkill;
import kodlama.hrms.entities.concretes.SchoolInfo;
import kodlama.hrms.entities.concretes.SocialLink;
import kodlama.hrms.entities.concretes.WorkExperience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeDto {
	private Candidate candidate;
	private List<WorkExperience> workExperiencea;
	private List<SocialLink> socialLinks;
	private List<SchoolInfo> schoolInfos;
	private List<ProgramingSkill> programingSkills;
	private List<Language> languages;
	private List<CoverLetter> coverLetters;
}
