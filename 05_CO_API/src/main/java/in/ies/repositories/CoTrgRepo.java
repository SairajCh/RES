package in.ies.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ies.entities.CoTriggerEntity;

public interface CoTrgRepo extends JpaRepository<CoTriggerEntity,Integer> {
	
	public List<CoTriggerEntity> findByTrgStatus(String status);

}
