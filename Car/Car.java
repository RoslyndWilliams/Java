package Car;

public class Car
{
    String color;
    String name;
    int mpg;
    int yearMade;
    int milesDriven ;

    public Car(String carColor, String carName, int milesPerGallon, int yearCarWasMade, int milesCarDriven)
    {
        color = carColor;
        name = carName;
        mpg = milesPerGallon;
        yearMade = yearCarWasMade;
        milesDriven = milesCarDriven;
    }

    public static void drive(int milesCarDriven)
    {

        String message = "Miles driven as of yesterday: " + milesCarDriven;
        System.out.println(message);
    }

}
