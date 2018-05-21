package io.redos.entity;

import java.util.List;

public class FemaleStudentBean extends StudentBean {

    public FemaleStudentBean(Integer id, String cnname) {
        super(id, cnname);
    }

    private List<StudentHealthFemaleBean> studentHealthFemaleList = null;

    public List<StudentHealthFemaleBean> getStudentHealthFemaleList() {
        return studentHealthFemaleList;
    }

    public void setStudentHealthFemaleList(List<StudentHealthFemaleBean> studentHealthFemaleList) {
        this.studentHealthFemaleList = studentHealthFemaleList;
    }

    @Override
    public String toString() {
        return "FemaleStudentBean [studentHealthFemaleList=" + studentHealthFemaleList + "]" + super.toString();
    }

}