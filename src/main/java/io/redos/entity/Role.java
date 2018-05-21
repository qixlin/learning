package io.redos.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/17 12:03
 * @copyright ©2018
 */
@Setter
@Getter
//@Alias("role")
public class Role {
    private long id;
    private String roleName;
    private String notes;
    private SexEnum sex;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Role{");
        sb.append("id=").append(id);
        sb.append(", roleName='").append(roleName).append('\'');
        sb.append(", notes='").append(notes).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
