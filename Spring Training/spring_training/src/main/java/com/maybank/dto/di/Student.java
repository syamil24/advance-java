package com.maybank.dto.di;

public class Student {

    private String name;
    private Laptop laptop;

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return laptop return the laptop
     */
    public Laptop getLaptop() {
        return laptop;
    }

    /**
     * @param laptop the laptop to set
     */
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

}
