package in.ies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ies.entities.KidEntity;

public interface KidRepo extends JpaRepository<KidEntity,Integer> {

}
