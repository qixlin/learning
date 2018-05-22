package io.redos.mapper;

import io.redos.entity.StudentLectureBean;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/22 9:03
 * @copyright ©2018
 */
public interface StudentLectureMapper {
    StudentLectureBean selectStudentLecture(long id);
}
