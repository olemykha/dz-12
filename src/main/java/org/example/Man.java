package org.example;

public class Man extends Person{
    public Man(String firstName, String lastName, int age, String nationality, Person partner) {
        super(firstName, lastName, age, nationality, partner);
    }
    public boolean isRetired() {
        return getAge() > 65;
    }
    public void registerPartnership(Woman woman){
        setPartner(woman);
        woman.setPartner(this);
    }
    public void deregisterPartnership() {
        setPartner(null);
    }
}
