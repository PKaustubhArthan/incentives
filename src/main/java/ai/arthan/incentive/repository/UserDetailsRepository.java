package ai.arthan.incentive.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ai.arthan.incentive.entities.UserDetails;


@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails,String>{
@Query("select * from app_users where emp_role = :role")
public List<UserDetails> findAllByRoll(@Param("role") String role);

}
