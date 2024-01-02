package ai.arthan.incentive.service;

import ai.arthan.incentive.entities.Pd1Details;
import ai.arthan.incentive.entities.UserDetails;
import ai.arthan.incentive.repository.Pd1DetailsRepository;
import ai.arthan.incentive.repository.UserDetailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class IncentiveCalculationService {
    private final String RM = "Relationship Manager";
    private final String SR_RM = "Senior Relationship Manager";
    private final String PRODUCT_TYPE_SECURED="Secure";
    private final String PRODUCT_TYPE_UNSECURED="Unnati";
    //--------------------------------------------------
    private final Integer slab1Bucket = 700;
    private final Integer slab2Bucket = 1200;
    private final Integer slab3Bucket = 1500;
    //---------------------------------------------------
    private final String FETCH_STAGE="OPS_QUEUE";
    @Autowired
    private UserDetailsRepository userDetailsRepository;
    @Autowired
    private Pd1DetailsRepository pd1DetailsRepository;
//@Scheduled(cron = "* * * * * *")
public void calculateRMIncentives()
{
    //CALCULATE FOR RMS
   List<UserDetails> userDetails = userDetailsRepository.findAllByRoll(RM);
if(userDetails!=null)userDetails.forEach(data->{calculateIncentiveForParticularRm(data);});
    //CALCULATE FOR SENIOR RMS
     userDetails = userDetailsRepository.findAllByRoll(SR_RM);
    if(userDetails!=null) userDetails.forEach(data->{calculateIncentiveForParticularRm(data);});


}

public void calculateIncentiveForParticularRm(UserDetails user )
{
String rmId = user.getEmp_code();
LocalDate startDate = LocalDate.now().withDayOfMonth(1);
Integer lastDay = startDate.lengthOfMonth();
LocalDate endDate = startDate.withDayOfMonth(lastDay);
System.out.println(startDate);
System.out.println(endDate);
BigDecimal totalDisbursement = calculateSumOfApprovedAmount(PRODUCT_TYPE_SECURED,rmId,startDate,endDate);
    System.out.println("Total Disbursement for rm id "+rmId +" is "+totalDisbursement);

    LocalDate nowDate = LocalDate.now();
    //LocalDate joiningDate = user.gfg;

    //else if()
//        {
//            System.out.println("Value of the Big Decimal before adding = "+totalDisbursement);
//            totalDisbursement = totalDisbursement.add(BigDecimal.valueOf(Double.valueOf(pd1item.getCc_loan_amt())));
//            System.out.println("Value of the cc loan amount before adding = "+pd1item.getCc_loan_amt());
//            System.out.println("Value of the Big Decimal after adding = "+totalDisbursement);
//        }else{
//            System.out.println("Value of the Big Decimal before adding = "+totalDisbursement);
//            totalDisbursement = totalDisbursement.add(BigDecimal.valueOf(Double.valueOf(pd1item.getCcu_loan_amt2())));
//            System.out.println("Value of the ccu loan amount  = "+pd1item.getCcu_loan_amt2());
//            System.out.println("Value of the Big Decimal after adding = "+totalDisbursement);
//        }




}

    private BigDecimal calculateSumOfApprovedAmount(String productTypeSecured, String rmId, LocalDate startDate, LocalDate endDate) {
        List<Pd1Details> pd1DetailsList = pd1DetailsRepository.getDisbursementData(FETCH_STAGE, "Y", rmId, startDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), endDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), PRODUCT_TYPE_SECURED);
        BigDecimal sum = BigDecimal.ZERO;
        if (pd1DetailsList != null || !pd1DetailsList.isEmpty()) {

            List<Double> doubleValues = pd1DetailsList.stream().map(data -> {
                if (data == null) return 0d;
                else if (data.getCc_loan_amt2() != null) return Double.valueOf(data.getCc_loan_amt2());
                else if (data.getCcu_loan_amt2() != null) return Double.valueOf(data.getCcu_loan_amt2());
                else return 0d;
            }).collect(Collectors.toList());
            sum = doubleValues.stream().map(BigDecimal::new)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
            return sum;
        } else return BigDecimal.valueOf(0);// end of the main if else loop

    }
    private Double slabWiseBucketValue(BigDecimal totalDisburseMent)
    {

        return null;
    }
public void saveIncentiveDetails(BigDecimal value,String rmId)
{


}

}


