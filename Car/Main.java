package Car;

public class Main {

    public static void main(String[] args)
    {
        Car myFastCar = new Car("Galaxy Purple", "Galatia", 55, 2025, 7);
        myFastCar.drive(7);

        // miles driven today
        int afterYesterday = myFastCar.milesDriven + 800;
        myFastCar.milesDriven = afterYesterday;
        System.out.println("As of today, I've driven " + afterYesterday + " miles in my beautiful car!");

        // my driving plan for tomorrow
        int driveTomorrow = myFastCar.milesDriven +40;
        myFastCar.milesDriven = driveTomorrow;
        System.out.println("Tomorrow, I plan to take a trip. At the end of the trip, I'll have driven a total of " + myFastCar.milesDriven + " miles in " + myFastCar.name + ".");
    }
}
