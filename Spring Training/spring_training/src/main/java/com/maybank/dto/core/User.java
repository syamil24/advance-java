package com.maybank.dto.core;

public class User {

    private String name;

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

    public void init() {
        System.out.println("Init Method Called");
    }

    public void destroy() {
        System.out.println("Destroy Method Called");
    }

}
