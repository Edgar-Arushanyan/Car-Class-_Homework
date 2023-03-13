package Car_Homework;

public class Track extends Car{

    int loadCapacity;

    public Track(String model, String color, int productionDate, int loadCapacity) {
        super(model, color, productionDate);
        this.loadCapacity=loadCapacity;
    }
}
