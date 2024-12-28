package Vet;

public class Dog {
    String breed;
    String name;
    boolean hasOwner;
    double age;
    double weight;
    boolean isDead;
    boolean isVaccinated;
    boolean isFixed;
    boolean hasChip;

    public Dog(String dogBreed, String dogName, boolean isTheDogOwned, double dogYears, boolean isTheDogDead, double pounds, boolean isNeutered) {
        breed = dogBreed;
        name = dogName;
        hasOwner = isTheDogOwned;
        age = dogYears;
        isDead = isTheDogDead;
        weight = pounds;
        isFixed = isNeutered;


    }


    public static void main(String[] args) {

        Dog jiminy = new Dog("pit bull", "Jiminy", true, 0.5, false, 39.5, false);
        Dog kamari = new Dog("Husky mix", "Kamari", true, 4.5, false, 66.5, true);

        boolean doesJiminyWeighMore =  jiminy.weight > kamari.weight;
        boolean doTheyWeighTheSame = kamari.weight == jiminy.weight;


        System.out.print("The vet would like to know if Kamari and Jiminy are the same weight. So, are they? ");

        if (!doTheyWeighTheSame) {
            System.out.println("No.");
        } else {
            System.out.println("Yes, they are.");
        }

        System.out.println("Kamari is a " + kamari.breed + ".");

        if (!jiminy.isFixed) {
            System.out.println("By the way, Jiminy still needs to have his neutering appointment scheduled.");
        } else {
            System.out.println("Jiminy is all fixed up and ready to go!");
        }

    }


}