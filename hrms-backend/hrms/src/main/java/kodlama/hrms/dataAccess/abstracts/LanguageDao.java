package kodlama.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language,Integer> {

}
