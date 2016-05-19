package epam.block6.task1;

import epam.block6.task1.entities.*;

/**
 * Created by alexander on 19.05.16.
 */
public class Main {
    /**
     * Entity tree description
     * Transport is a main interface with declared move() method
     * Abstract classes Car and Bike implement Transport and initialize method move()
     * Classes PassengerCar and CargoCar extend Car and override move() method
     * Class MotorBike extends Bike and override move() method
     * Classes SomeCar and SomeBike include Car and Bike accordingly and initialize constructor which contains Model
     * Class CrossRoad describes a real road and got some methods to work with
     * @param args
     */
    public static void main(String[] args) {
        CrossRoad crossRoad = new CrossRoad();
        SomeBike bike = new SomeBike(new MotorBike("AA5123BC", crossRoad), Model.YAMAHA);
        bike.move();
        SomeCar someCar = new SomeCar(new PassengerCar("AA3311AS", crossRoad), Model.AUDI);
        someCar.move();
        SomeCar cargoCar = new SomeCar(new CargoCar("AA1112VA", crossRoad), Model.YAMAHA);
        cargoCar.move();
        SomeCar a5 = new SomeCar(new PassengerCar("AA5555BB", crossRoad), Model.AUDI);
        a5.move();

        System.out.println(crossRoad.transrortList.size()+" transports went through the crossroad");
        System.out.println(crossRoad.cargoCars()+" cargo cars went through the crossroad");
        System.out.println("Yamaha with registration AA5123BC "+
                ((crossRoad.requiredBike("AA5123BC", Model.YAMAHA)) ? " went" : "didn't go") + " through the crossroad");

    }
}
