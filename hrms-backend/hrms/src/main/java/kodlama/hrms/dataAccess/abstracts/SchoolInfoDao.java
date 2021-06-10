package kodlama.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrms.entities.concretes.SchoolInfo;

public interface SchoolInfoDao extends JpaRepository<SchoolInfo,Integer>{

}
