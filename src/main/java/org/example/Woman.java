package org.example;

public class Woman extends Person {
    private String previousLastName;
    public Woman(String firstName, String lastName, int age, String nationality, Person partner) {
        super(firstName, lastName, age, nationality, partner);
    }
    public boolean isRetired() {
        return getAge() > 60;
    }
    public void registerPartnership(Man man) {
        setPartner(man);
        previousLastName = getLastName();
        setLastName(man.getLastName());
        man.setPartner(this);
    }
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        setPartner(null);
        if (returnToPreviousLastName) {
            setLastName(previousLastName);
        }
    }
}