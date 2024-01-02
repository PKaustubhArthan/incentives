package ai.arthan.incentive.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name="total_incentives_master")
@AllArgsConstructor
@NoArgsConstructor
public class TotalIncentives {
    @Column("id")
    @Id
    private Integer id;
    @Column("emp_code")
    private String empCode;
    @Column("month")
    private Integer month;
    @Column("year")
    private Integer year;
    @Column("total_incentive")
    private Integer totalIncentives;
    @Column("scheme_id")
    private String schemeId;
}
