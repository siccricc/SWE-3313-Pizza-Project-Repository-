public class Manager {
    package com.example.pizza_project_intellij;

    public class Manager {
        private String name;
        private final int password = 48679;



        public Manager() {
        }
        public Manager(String name,int password){
            this.name=name;
            boolean access =false;

            if(password==48679){
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
}
