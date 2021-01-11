package com.ithema;

public class Controller {
    public static void main(String[] args) {
        Student stu=new Student();
//        stu.setId(2018108102);
//        stu.setName("妮妮");
        stu.setAge(18);
        stu.setPhone("13100586256");

        Teacher teacher=new Teacher();
//        teacher.setId(123);
//        teacher.setName("li");
        teacher.setZhiwei("校长");

        Child child=new Child("哇哇哇",1.25);
//        child.setId(100);
//        child.setName("花花");
        System.out.println(child.getId()+child.getName()+child.getCry()+child.getHeight());


        System.out.println(stu.getId());
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getPhone());


        System.out.println(teacher.getId());
        System.out.println(teacher.getName());
        System.out.println(teacher.getZhiwei());


    }



}
