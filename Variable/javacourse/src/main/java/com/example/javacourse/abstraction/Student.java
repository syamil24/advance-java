package com.example.javacourse.abstraction;

//abstraction will need to implement all college class
//can inherit multiple inheritance because all the function is just the declaration without definition
public class Student implements College {
    @Override
    public void payFees() {
        System.out.println("Student will pay fee");
    }

    @Override
    public void attendExam() {
        System.out.println("Student is attending Exam");
    }

    @Override
    public void enrollSocialService() {
        System.out.println("Student will enroll social service");
    }

    @Override
    public void r1() {

    }

    @Override
    public void r2() {

    }

    @Override
    public void r3() {

    }
}
