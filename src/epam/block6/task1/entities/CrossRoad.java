package epam.block6.task1.entities;

import java.util.LinkedList;

/**
 * Created by alexander on 20.05.16.
 */
public class CrossRoad {

    public  LinkedList<Transport> transrortList = new LinkedList<>();

    public  int cargoCars(){
        int counter = 0;
        for (Transport transport : transrortList){
            if (transport instanceof CargoCar) ++counter;
        }
        return counter;
    }

    public  boolean requiredBike(String registration, Model model){
        for (Transport transport : transrortList){
            if (transport instanceof Bike){
                if (registration.equals(((Bike) transport).registration) && ((Bike) transport).model.equals(model))
                    return true;
            }
        }
        return false;
    }

}
