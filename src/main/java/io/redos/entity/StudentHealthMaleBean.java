package io.redos.entity;

public class StudentHealthMaleBean extends StudentHealthBean {

    private String prostate;

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }

    @Override
    public String toString() {
        return "StudentHealthMaleBean [prostate=" + prostate + "]" + super.toString();
    }

}