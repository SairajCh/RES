package in.ies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ies.entities.EducationEntity;

public interface EducationRepo extends JpaRepository<EducationRepo,Integer>{


	@Query("from EducationEntity where caseNum=:caseNum")
	public EducationEntity findByCaseNum(Long caseNum);

}
