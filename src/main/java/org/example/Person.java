package org.example;

public class Person {
    String firstname;
    String lastname;
    int age;
    String eyeColor;
    boolean isMarried;
    double height;

    public Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public Person(String firstname, String lastname, int age, String eyeColor, boolean isMarried, double height){
        this(firstname, lastname, age);
        this.eyeColor = eyeColor;
        this.isMarried = isMarried;
        this.height = height;
    }

    public String getFirstName(){
        return this.firstname;
    }
    public String getLastName(){
        return this.lastname;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        if(this.age >= 13 && this.age <= 19) {
            return true;
        }
        return false;
    }
}
