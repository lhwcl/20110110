package com.ithema;

public class Teacher extends User{
    public String getZhiwei() {
        return zhiwei;
    }
    public Teacher(){
        super(222,"ttt");
    }
    public void setZhiwei(String zhiwei) {
        this.zhiwei = zhiwei;
    }

    private String zhiwei;
}
