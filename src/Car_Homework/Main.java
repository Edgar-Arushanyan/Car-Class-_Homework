package Car_Homework;

public class Main {

    public static void main(String[] args) {

        Car vw = new Car("VW","Black",2011);

        System.out.println("Model: "+vw.model);
        System.out.println("Color: "+vw.color);
        System.out.println("Production Date: "+vw.productionDate);
        vw.drive();
        vw.stop();
        System.out.println("-----------------------");

        //-----------------------------------------------------//------------------------------------

        PassengerCar lexus = new PassengerCar("Lexus","Gray",2015,5);

        System.out.println("Model: "+lexus.model);
        System.out.println("Color: "+lexus.color);
        System.out.println("Production Date: "+lexus.productionDate);
        System.out.println("Number Of Seats: "+lexus.numberOfSeats);
        lexus.drive();
        lexus.stop();
        System.out.println("-----------------------");

        //------------------------------------------------//--------------------------------------------

        Track tesla = new Track("Tesla","White",2020,1500);

        System.out.println("Model: "+tesla.model);
        System.out.println("Color: "+tesla.color);
        System.out.println("Production Date: "+tesla.productionDate);
        System.out.println("Load Capacity: "+tesla.loadCapacity);
        tesla.drive();
        tesla.stop();

        /*
        Model: VW
        Color: Black
        Production Date: 2011
        Drive
        Stop
        -----------------------
        Model: Lexus
        Color: Gray
        Production Date: 2015
        Number Of Seats: 5
        Drive
        Stop
        -----------------------
        Model: Tesla
        Color: White
        Production Date: 2020
        Load Capacity: 1500
        Drive
        Stop
         */









    }
}
