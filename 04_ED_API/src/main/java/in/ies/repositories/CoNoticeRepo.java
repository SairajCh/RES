package in.ies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ies.entities.EligEntity;

public interface CoNoticeRepo extends JpaRepository<EligEntity,Integer> {

}