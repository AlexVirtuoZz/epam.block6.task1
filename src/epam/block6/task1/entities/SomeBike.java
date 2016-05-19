package epam.block6.task1.entities;

/**
 * Created by alexander on 20.05.16.
 */
public class SomeBike {
    Bike bike;

    public SomeBike(Bike bike, Model model){
        this.bike = bike;
        bike.model = model;
    }

    public void move(){
        bike.move();
    }
}
