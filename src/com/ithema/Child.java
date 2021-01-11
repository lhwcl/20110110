package com.ithema;

public class Child extends User{
    private String cry;
    private double height;
    public Child(String cry,double height){
        super(100,"花花");
        this.cry=cry;
        this.height=height;
    }

    public String getCry() {
        return cry;
    }

//    public void setCry(String cry) {
//        this.cry = cry;
//    }

    public double getHeight() {
        return height;
    }

//    public void setHeight(float height) {
//        this.height = height;
//    }
}
