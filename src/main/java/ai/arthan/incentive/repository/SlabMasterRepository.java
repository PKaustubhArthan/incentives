package ai.arthan.incentive.repository;

import ai.arthan.incentive.entities.SlabMaster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlabMasterRepository extends CrudRepository<SlabMaster,Integer> {


}
