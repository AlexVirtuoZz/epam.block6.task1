package epam.block6.task1.entities;

/**
 * Created by alexander on 19.05.16.
 */
public abstract class Car implements Transport {
    String registration;
    Model model;
    CrossRoad crossRoad;

    public void move(){
     crossRoad.transrortList.add(this);
    }

}
