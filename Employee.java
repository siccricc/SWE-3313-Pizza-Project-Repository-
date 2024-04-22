public class Employee {
      package com.example.pizza_project_intellij;
    private String name;
    private final int password = 97684;



    public Employee() {
    }
    public Employee(String name,int password){
        this.name=name;
        boolean access =false;

        if(password==97684){
            access=true;
        }
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }
}

