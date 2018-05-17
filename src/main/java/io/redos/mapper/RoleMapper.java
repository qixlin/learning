package io.redos.mapper;

import io.redos.entity.Role;
import org.apache.ibatis.annotations.Select;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/17 12:17
 * @copyright ©2018
 */
public interface RoleMapper {
    Role getRole(long id);

    @Select(value = "select role_name from role where id= #{id}")
    String getRoleName(long id);

    int insertRole(Role role);

    int deleteRole(long id);
}
