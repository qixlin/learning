package io.redos.mapper;

import io.redos.entity.StudentBean;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/21 15:36
 * @copyright ©2018
 */
public interface StudentSelfCardMapper {
    StudentBean selectCardById(long student_id);
}
