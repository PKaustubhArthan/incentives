package ai.arthan.incentive;

import ai.arthan.incentive.service.IncentiveCalculationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IncentiveApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(IncentiveApplication.class, args);
		context.getBean(IncentiveCalculationService.class).calculateRMIncentives();
		//calculateRMIncentives();
	}

}
