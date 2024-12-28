

//Create the Droid class
public class Droid
{

    //Create instance fields for erach droid's name and battery level
    String name;
    int batteryLevel;


    //Constructor method
    public Droid(String droidName)
    {
        name = droidName;
        batteryLevel = 100;

    }


    //Define a method that makes the droid say its name in a rhyme

    public void nameRhyme()
    {
        System.out.println(name + "'s my name and performing tasks for you is my game! What task would you like me to perform for you?");
        System.out.println();

    }


    //Define a method that checks the energy level of a droid
    public void checkBatteryLevel()
    {
        System.out.println("I've just checked my battery level. The report states that I'm now at " + this.batteryLevel + "% battery level.");
    }


    //Define a method that makes the droid perform a String task

    public void performTask(String task)
    {
        System.out.println(name + " is performing task: " + task);
        System.out.println();
        this.reduceBattery();
        this.checkBatteryLevel();
    }


    //Define a method that reduces the droid's battery level after it performs a task
    public void reduceBattery()
    {

        int batteryReducedBy10 = batteryLevel - 10;
        batteryLevel = batteryReducedBy10;
        System.out.println("Uh oh! " + name + "'s battery level has gone down. Now, it's only " + batteryLevel + "%!");
        System.out.println("----------------------");
        System.out.println();

    }


    //Define a method that exchanges batteryLevel energy between instances

    public void energyTransfer(Droid otherDroid)
    {
        if (this.batteryLevel <= 40 && otherDroid.batteryLevel >= 70)
        {
            this.batteryLevel += 10;
            otherDroid.batteryLevel -= 10;
            System.out.println("*************|||||*************");
            System.out.println("How generous of " + otherDroid.name + "! They gifted " + this.name + " 10% of their energy.");
            System.out.println("*************|||||*************");
        }
        else if (otherDroid.batteryLevel <= 40 && this.batteryLevel >= 70)
        {
            this.batteryLevel -= 10;
            otherDroid.batteryLevel += 10;
            System.out.println("*************|||||*************");
            System.out.println("How generous of " + this.name + "! They gifted " + otherDroid.name + " 10% of their energy.");
            System.out.println("*************|||||*************");
        }

    }



    //Initialize the main method
    public static void main(String[] args)
    {


        /** Create an instance of Droid named Codey
         */
        Droid codey = new Droid("Codey");
        codey.nameRhyme();

        //Get Codey to dance
        codey.performTask("dancing");

        //Get Codey to cook
        codey.performTask("cooking");

        //Get Codey to roller skate
        codey.performTask("roller skating");

        //Get Codey to eat Skittles
        codey.performTask("eating Skittles");

        //Get Codey to type
        codey.performTask("typing");

        //Get Codey to wrapping gifts
        codey.performTask("wrapping gifts and placing them under the tree");

        //Get Codey to playing a musical instrument
        codey.performTask("playing a musical instrument");

        //Get Codey to carving a mask
        codey.performTask("carving a mask");


        /** Create an instance of a droid named Torey
         */
        Droid torey = new Droid("Torey");
        torey.nameRhyme();

        //Get Torey to sing
        torey.performTask("singing");


        //Run energyTransfer method
        torey.energyTransfer(new Droid("Codey"));
        codey.energyTransfer(new Droid("Torey"));


        //Retrieve Codey's new battery level
        codey.checkBatteryLevel();

        //Retrieve Torey's new battery level
        torey.checkBatteryLevel();

    }

    //Define a toString method
    public String toString()
    {
        return "Hello, I'm the droid named " + name + " and I'm lost. :( ";
    }


}