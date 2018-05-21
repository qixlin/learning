package io.redos.entity;

public class StudentHealthFemaleBean extends StudentHealthBean {

    private String uterus;

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus;
    }

    @Override
    public String toString() {
        return "StudentHealthFemaleBean [uterus=" + uterus + "]" + super.toString();
    }

}