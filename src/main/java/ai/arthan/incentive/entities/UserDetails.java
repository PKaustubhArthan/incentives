package ai.arthan.incentive.entities;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
@Data
@Table("app_users")
public class UserDetails {
@Id
private String emp_code;
private String name;
private String mob_no;
private String mail_id;
private String emp_role;
private String branch_id;
private String branch_name;
private String cluster_id;
private String mpin;
private String active;
private String attempt_cnt;
private String limit_hit;
private String token;
private Timestamp logout_time;
}
