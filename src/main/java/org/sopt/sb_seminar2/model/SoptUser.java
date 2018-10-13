package org.sopt.sb_seminar2.model;

/**
 * Created by ehay@naver.com on 2018-10-13
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class SoptUser {
    private String name;
    private String part;

    public SoptUser() {
    }

    public SoptUser(String name, String part) {
        this.name = name;
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }
}
