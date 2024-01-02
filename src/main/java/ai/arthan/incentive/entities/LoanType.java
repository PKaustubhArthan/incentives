package ai.arthan.incentive.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
@Data
@Table("Loan_Type")
@Builder
public class LoanType {
    @Id
    @Column("Id")
    private Integer Id;
    @Column("loan_by")
    private String loan_by;
    @Column("loan_type")
    private String loan_type;
    @Column("description")
    private String description;
    @Column("start_limit")
    private String start_limit;
    @Column("end_limit")
    private String end_limit;
}
