package epam.block6.task1.entities;

/**
 * Created by alexander on 20.05.16.
 */
public class PassengerCar extends Car {

    public PassengerCar(String registration, CrossRoad crossRoad){
        this.registration = registration;
        this.crossRoad = crossRoad;
    }

    @Override
    public void move(){
        super.move();
        System.out.println("Delivering people by the ground on "+model.getName());
    }

}
