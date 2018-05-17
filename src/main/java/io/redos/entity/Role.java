package io.redos.entity;

import lombok.Getter;
import lombok.Setter;

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
public class Role {
    private long id;
    private String role_name;
    private String notes;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Role{");
        sb.append("id=").append(id);
        sb.append(", roleName='").append(role_name).append('\'');
        sb.append(", notes='").append(notes).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
