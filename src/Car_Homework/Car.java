package Car_Homework;

public class Car {
    //Задача !
    //Создать класс Car, содержащий поля   *
    //model                                *
    //colour                               *
    //productionDate                       *
    //а также конструктор и методы drive и stop.    *
    //Создать дочерние классы PassengerCar и Track. *
    // Класс PassengerCar должен также содержать поле numberOfSeats(количество мест) *
    // а Класс Track поле loadCapacity (грузоподьемность).                           *
    //В методе main класса Main создать несколько обьектов этих классов
    // и вывести в консоль их характеристики и результат работы методов

     String model;

     String color;

     int productionDate;

    public Car(String model, String color, int productionDate) {
        this.model = model;
        this.color = color;
        this.productionDate = productionDate;
    }
    public void drive(){
        System.out.println("Drive");
    }

    public void stop(){
        System.out.println("Stop");
    }
}
