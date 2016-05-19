package epam.block6.task1.entities;

/**
 * Created by alexander on 20.05.16.
 */
public class Bike implements Transport {
    String registration;
    Model model;
    CrossRoad crossRoad;

    public void move(){
        crossRoad.transrortList.add(this);
    }
}
