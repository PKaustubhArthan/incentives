package ai.arthan.incentive.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Table("Pd1_Details")
@Builder
public class Pd1Details {
	
	@Id
	@Column("pd1_id")
    private Integer pd1_id;
	
	@Column("customer_id")
	private String customer_id;
	
	@Column("loan_id")
	private String loan_id;
	
	@Column("methodused")
	private String methodused;
	
	@Column("highPerWeekCount")
	private String highPerWeekCount;
	
	@Column("mediumPerWeekCount")
	private String mediumPerWeekCount;
	
	@Column("lowPerWeekCount")
	private String lowPerWeekCount;
	
	@Column("highPerDayAmount")
	private String highPerDayAmount;
	
	@Column("mediumPerDayAmount")
	private String mediumPerDayAmount;
	
	@Column("lowPerDayAmount")
	private String lowPerDayAmount;
	
	@Column("grossMarginVerifiedByBcm")
	private String grossMarginVerifiedByBcm;
	
	@Column("otherIncomeSalaries")
	private String otherIncomeSalaries;
	
	@Column("otherIncomeRent")
	private String otherIncomeRent;
	
	@Column("otherIncomeAgriculture")
	private String otherIncomeAgriculture;
	
	@Column("otherIncome")
	private String otherIncome;
	
	@Column("salaries")
	private String salaries;
	
	@Column("rent")
	private String rent;
	
	@Column("utilities")
	private String utilities;
	
	@Column("licenseRenewal")
	private String licenseRenewal;
	
	@Column("transportation")
	private String transportation;
	
	@Column("financialExpenses")
	private String financialExpenses;
	
	@Column("otherOpex")
	private String otherOpex;
	
	@Column("food")
	private String food;
	
	@Column("clothing")
	private String clothing;
	
	@Column("education")
	private String education;
	
	@Column("healthcare")
	private String healthcare;
	
	@Column("personalDebt")
	private String personalDebt;
	
	@Column("otherhhExpnse")
	private String otherhhExpnse;
	
	
	@Column("loanamountrecommended")
	private String loanamountrecommended;
	
	
	@Column("comf_emi")
	private String comf_emi;
	
	
	@Column("home_rent")
	private String home_rent;
	
	
	@Column("banking_turnover")
	private String banking_turnover;
	
	@Column("ltvCam")
	private String ltvCam;
	
	@Column("foirCam")
	private String foirCam;
	
	@Column("loanEligCam")
	private String loanEligCam;
	
	@Column("obligCam")
	private String obligCam;
	
	@Column("loan_amt")
	private String loan_amt;
	
	@Column("tenure")
	private String tenure;
	
	@Column("prop_value")
	private String prop_value;
	
	@Column("turnover")
	private String turnover;
	
	@Column("margin")
	private String margin;
	
	@Column("roi")
	private String roi;
	
	@Column("home_utilities")
	private String home_utilities;
	
	@Column("netMonthlyIncome")
	private String netMonthlyIncome;
	
	@Column("obligEmi")
	private String obligEmi;
	
	@Column("txn_time_stamp")
	private String txn_time_stamp;
	@Column("prop_type")
	private String prop_type;
	@Column("google_check")
	private String google_check;
	@Column("reference_check")
	private String reference_check;
	@Column("rcu_status")
	private String rcu_status;
	@Column("legal_status")
	private String legal_status;
	@Column("tech_status")
	private String tech_status;
	@Column("due_diligence")
	private String due_diligence;
	@Column("net_business_income")
	private String net_business_income;
	
	@Column("proposed_emi")
	private String proposed_emi;
	
	@Column("remarks_summary")
	private String remarks_summary;
	
	@Column("final_turnover")
	private String final_turnover;
	
	@Column("pd_obligation")
	private String pd_obligation;
	
	@Column("rtr_comments")
	private String rtr_comments;
	
	@Column("property_area")
	private String property_area;
	
	@Column("ccm_loan_amt")
	private String ccm_loan_amt;
	
	@Column("ccm_tenure")
	private String ccm_tenure;
	
	@Column("ccm_property")
	private String ccm_property;
	
	@Column("buss_premise_ownership")
	private String buss_premise_ownership;
	
	@Column("pd_margin")
	private String pd_margin;
	
	@Column("cc_loan_amt")
	private String cc_loan_amt;
	
	@Column("cc_tenure")
	private String cc_tenure;
	
	@Column("resi_premise_ownership")
	private String resi_premise_ownership;
	
	@Column("ccm_loan_amt2")
	private String ccm_loan_amt2;
	
	@Column("ccm_tenure2")
	private String ccm_tenure2;
	
	@Column("ccm_property2")
	private String ccm_property2;
	
	@Column("cc_loan_amt2")
	private String cc_loan_amt2;
	
	@Column("cc_tenure2")
	private String cc_tenure2;
	
	@Column("loanamountrecommended2")
	private String loanamountrecommended2;
	
	@Column("tenure2")
	private String tenure2;
	
	@Column("prop_value2")
	private String prop_value2;
	
	@Column("expenses")
	private String expenses;
	
	@Column("cbo_roi")
	private String cbo_roi;
	
	@Column("cbo_pf")
	private String cbo_pf;
	
	@Column("tech_prop_val")
	private String tech_prop_val;
	
	@Column("loanApprovalFlag")
	private String loanApprovalFlag;
	
	@Column("borrowerScore")
	private String borrowerScore;
	
	@Column("aggregatedScore")
	private String aggregatedScore;
	
	@Column("grantableAmount")
	private String grantableAmount;
	
	@Column("spdc1")
	private String spdc1;
	
	@Column("spdc2")
	private String spdc2;
	
	@Column("spdc3")
	private String spdc3;
	
	@Column("bpi1")
	private String bpi1;
	
	@Column("bpi2")
	private String bpi2;
	
	@Column("bpi1_ops")
	private String bpi1_ops;
	
	@Column("bpi2_ops")
	private String bpi2_ops;
	
	@Column("disb_date")
	private String disb_date;
	
	@Column("install_amt1")
	private String install_amt1;
	
	@Column("install_amt2")
	private String install_amt2;
	
	@Column("ccu_loan_amt")
	private String ccu_loan_amt;
	
	@Column("ccu_loan_amt2")
	private String ccu_loan_amt2;
	
	@Column("ccu_tenure")
	private String ccu_tenure;
	
	@Column("ccu_tenure2")
	private String ccu_tenure2;
	
	@Column("final_margin")
	private String final_margin;
	
	@Column("margin_remarks")
	private String margin_remarks;
	
	@Column("margin_option")
	private String margin_option;
	
	
	
	
	
	
	
	
	
	
	
}
