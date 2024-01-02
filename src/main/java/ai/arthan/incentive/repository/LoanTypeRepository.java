package ai.arthan.incentive.repository;

import ai.arthan.incentive.entities.LoanType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanTypeRepository extends CrudRepository<LoanType,Integer>
{


}
