package kodlama.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrms.entities.concretes.SocialLink;

public interface SocialLinkDao extends JpaRepository<SocialLink,Integer>{

}
