package ai.arthan.incentive.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("incentive_slab_master")
public class SlabMaster {
@Column("id")
@Id
private Integer id;
@Column("slab_name")
    private String slab_name;
    @Column("slab_lower_limit")
    private String slab_lower_limit;
    @Column("slab_max_limit")
    private String slab_max_limit;
    @Column("year")
    private String year;
    @Column("month")
    private String month;
    @Column("created_by")
    private String created_by;
    @Column("created_on")
    private String created_on;
    @Column("updated_by")
    private String updated_by;
    @Column("updated_on")
    private String updated_on;
    @Column("lower_equals")
    private Boolean lower_equals;
    @Column("higher_equals")
    private Boolean higher_equals;
    @Column("scheme_id")
    private String scheme_id;
    @Column("slab_type")
    private String slabType;
    @Column("consider_range")
    private Boolean consider_range;
    @Column("consider_column")
    private String consider_column;

}
