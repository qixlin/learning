package io.redos.entity;

import java.util.List;

public class MaleStudentBean extends StudentBean {

    public MaleStudentBean(Integer id, String cnname) {
        super(id, cnname);
    }

    private List<StudentHealthMaleBean> studentHealthMaleList = null;

    public List<StudentHealthMaleBean> getStudentHealthMaleList() {
        return studentHealthMaleList;
    }

    public void setStudentHealthMaleList(List<StudentHealthMaleBean> studentHealthMaleList) {
        this.studentHealthMaleList = studentHealthMaleList;
    }

    @Override
    public String toString() {
        return "MaleStudentBean [studentHealthMaleList=" + studentHealthMaleList + "]" + super.toString();
    }

}