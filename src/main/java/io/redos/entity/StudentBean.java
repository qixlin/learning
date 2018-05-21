package io.redos.entity;

import java.util.List;

public class StudentBean {

    private Integer id;

    private String cnname;

    private SexEnum sex;

    private Integer selfcardNo;

    private String note;

    private Boolean effective;

    private StudentSelfcardBean studentSelfcard;

    private List<StudentLectureBean> studentLectureList;

    public StudentBean(Integer id, String cnname,Integer selfcardNo, String note) {
        this.id = id;
        this.cnname = cnname;
        this.selfcardNo = selfcardNo;
        this.note = note;
    }

    public StudentBean(Integer id, String cnname) {
        this.id = id;
        this.cnname = cnname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public Integer getSelfcardNo() {
        return selfcardNo;
    }

    public void setSelfcardNo(Integer selfcardNo) {
        this.selfcardNo = selfcardNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getEffective() {
        return effective;
    }

    public void setEffective(Boolean effective) {
        this.effective = effective;
    }

    public StudentSelfcardBean getStudentSelfcard() {
        return studentSelfcard;
    }

    public void setStudentSelfcard(StudentSelfcardBean studentSelfcard) {
        this.studentSelfcard = studentSelfcard;
    }

    public List<StudentLectureBean> getStudentLectureList() {
        return studentLectureList;
    }

    public void setStudentLectureList(List<StudentLectureBean> studentLectureList) {
        this.studentLectureList = studentLectureList;
    }

    @Override
    public String toString() {
        return "StudentBean [id=" + id + ", cnname=" + cnname + ", sex=" + sex + ", selfcardNo=" + selfcardNo
                + ", note=" + note + ", effective=" + effective + ", studentSelfcard=" + studentSelfcard
                + ", studentLectureList=" + studentLectureList + "]";
    }

}