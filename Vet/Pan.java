package Vet;

//A class called Pan

public class Pan
{

    // Create instance fields

    public String species;
    public String name;
    public double age;
    public String ownerName;


    //Create an instance field, ownerAge, that will be equated with another instance field, age, within the constructor method

    double ownerAge;


    /**
     * Constructor method
     */

    public Pan(String panSpecies, String panName, double panAge, String panOwner)
    {

        //Assign instance fields to constructor parameters

        species = panSpecies;
        name = panName;
        age = panAge;
        ownerName = panOwner;
        ownerAge = panAge;

    }


    /**
     * Main method for class Pan
     */

    public static void main(String[] args)
    {

        /*
        Create instance of Pan called "pan"
        @param args
        */

        Pan pan = new Pan("daemon", "Pantalymaen", 0.75, "Lyra");

                //Print a statement describing Pan and his human, Lyra

                System.out.println("This is " + pan.name + ", and he belongs to a particularly unique species of animalia known as the " + pan.species + ". Daemons are connected--enmeshed, even, with their owners, and can never leave their side. They must never separate, for if they do, they both will die. The only homo sapiens who can separate from their daemons and live are the witches.");
                System.out.println();
                System.out.println("Now, " + pan.name + "'s owner is " + pan.ownerName + ". She's a baby only " + pan.ownerAge + " years old. Since daemons and their humans are born at the same time, Pan is the same age as Lyra. An important thing to note is that when a human or their daemon dies, the other dies also. So, we must take the utmost care in ensuring that " + pan.name + " and " + pan.ownerName + " are never, ever separated or come to any harm. Their lives depend on it. Their lives depend on us.");


    }
}
