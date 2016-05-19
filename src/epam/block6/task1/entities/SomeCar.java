package epam.block6.task1.entities;

/**
 * Created by alexander on 20.05.16.
 */
public class SomeCar {
    Car car;

    public SomeCar(Car car, Model model){
        this.car = car;
        car.model = model;
    }

    public void move(){
        car.move();
    }
}
