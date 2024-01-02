package ai.arthan.incentive.repository;

import ai.arthan.incentive.entities.TotalIncentives;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalIncentivesRepository extends CrudRepository<TotalIncentives,Integer> {

    
}
