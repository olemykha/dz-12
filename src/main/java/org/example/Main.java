package org.example;

public class Main {
    public static void main(String[] args) {
        Man alex = new Man("Alex","Danylo", 30,"UKR",null);
        Woman sofa = new Woman("Sofia", "Beluchi",18,"ITA",null);

        alex.registerPartnership(sofa);
        System.out.println(alex.getPartner());

        System.out.println();

        alex.deregisterPartnership();
        System.out.println(alex.getPartner());

        System.out.println();

        sofa.registerPartnership(alex);
        System.out.println(sofa.getPartner());

        System.out.println();

        sofa.deregisterPartnership(false);
        System.out.println(sofa.getLastName());

        System.out.println();

        sofa.deregisterPartnership(true);
        System.out.println(sofa.getLastName());
    }
}
