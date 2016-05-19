package epam.block6.task1.entities;

/**
 * Created by alexander on 20.05.16.
 */
public class MotorBike extends Bike {

    public MotorBike(String registration, CrossRoad crossRoad){
        this.registration = registration;
        this.crossRoad = crossRoad;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Riding with wind on "+model.getName());
    }
}
