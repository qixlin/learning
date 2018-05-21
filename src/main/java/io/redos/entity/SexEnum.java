package io.redos.entity;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/18 16:08
 * @copyright ©2018
 */
public enum SexEnum {
    MALE(0, "男"), FAMALE(1, "女");

    SexEnum(int id, String value) {
        this.id = id;
        this.value = value;
    }

    private int id;
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static SexEnum getInstance(int i) {
        if (i == 0) {
            return MALE;
        } else if (i == 1) {
            return FAMALE;
        }
        return null;
    }
}
