package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
    private Person partner;
    public Person(String firstName, String lastName, int age, String nationality, Person partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
        this.partner = partner;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNationality() {
        return nationality;
    }
    public Person getPartner() {
        if (partner == null) {
            System.out.println("You're free!");
        }
        return partner;
    }
    public void setPartner(Person partner) {
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", partner=" + partner.firstName + " " + partner.lastName +
                '}';
    }

    public void setFirstName(String setFirstName) {
    }
}
