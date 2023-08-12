package com.example.javacourse;

public class Constructor {
    private int id;
    private String name;
    private String course;

    public Constructor(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    // we can make more than one constructor
    public Constructor(int id, String name) {
        /*
         * this.id = id;
         * this.name = name;
         * this.course = "Java";
         */
        this(id, name, "Java"); // calling the above constructor
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", course='" + getCourse() + "'" +
                "}";
    }

    public static void main(String[] args) {
        Constructor constructor1 = new Constructor(1, "Syamil", "IT");

        System.out.println(constructor1);
        System.out.println("ID is " + constructor1.id);
        System.out.println("Name is " + constructor1.name);
        System.out.println("Course is " + constructor1.course);
        System.out.println(constructor1.toString());
    }
}
