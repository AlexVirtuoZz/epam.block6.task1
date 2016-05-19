package epam.block6.task1.entities;

/**
 * Created by alexander on 20.05.16.
 */
public enum Model {
    YAMAHA("Yamaha"), DAEWOO("Daewoo"), AUDI("Audi");

    String name;

    public String getName(){
        return name;
    }

    Model(String name){
        this.name = name;
    }
}
