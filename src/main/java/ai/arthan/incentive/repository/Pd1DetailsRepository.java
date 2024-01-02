package ai.arthan.incentive.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ai.arthan.incentive.entities.Pd1Details;

@Repository
public interface Pd1DetailsRepository extends CrudRepository<Pd1Details,Integer>{

	
	@Query("select pd1.cc_loan_amt,pd1.cc_loan_amt2,pd1.ccu_loan_amt2,pd1.ccu_loan_amt  from loan_hist  as hist\r\n"
			+ "inner join Loan_details as loan on\r\n"
			+ "hist.loan_id=loan.loan_id\r\n"
			+ "inner join Lead_details as led on\r\n"
			+ "loan.lead_id=led.lead_id\r\n"
			+ "inner join Pd1_Details as pd1 on\r\n"
			+ "loan.loan_id =pd1.loan_id\r\n"
			+ "where loan.loan_type=:loan_type AND hist.stage=:stage and hist.current_stage=:current_stage and led.created_by=:created_by \r\n"
			+ " AND date(pd1.txn_time_stamp) between date(:start_date) and date(:end_date)order by led.txn_time_stamp desc,\r\n"
			+ "		 led.lead_id DESC;\r\n")
	public List<Pd1Details> getDisbursementData(@Param("stage") String stage,
			@Param("current_stage") String currentStage,
			@Param("created_by") String createdBy,
			@Param("start_date") String startDate,
			@Param("end_date") String endDate,
	   		@Param("loan_type") String loanType);
}
