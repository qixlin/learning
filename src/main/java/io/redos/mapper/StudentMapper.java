package io.redos.mapper;

import io.redos.entity.StudentBean;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/21 15:46
 * @copyright ©2018
 */
public interface StudentMapper {

    StudentBean selectStudentById(long id);
}
