package com.ithema;

public class Student extends User{


        private int age;
        private String phone;
public Student(){
    super(122,"liha");
}


        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }


}
