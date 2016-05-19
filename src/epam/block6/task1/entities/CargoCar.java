package epam.block6.task1.entities;

/**
 * Created by alexander on 19.05.16.
 */
public class CargoCar extends Car {

    public CargoCar(String registration, CrossRoad crossRoad){
        this.registration = registration;
        this.crossRoad = crossRoad;
    }

    @Override
    public void move(){
        super.move();
        System.out.println("Carrying cargo by the ground on "+model.getName());
    }

}
