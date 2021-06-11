package kodlama.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrms.entities.concretes.SocialLink;

public interface SocialLinkDao extends JpaRepository<SocialLink,Integer>{
	List<SocialLink> getAllByCandidateId(int candidatesId);
}
