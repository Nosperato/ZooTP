package ZooTD;

/**
 * Created by Administrateur on 04/11/2016.
 */
public abstract class AbstractAnimalFactocry {

    public static AnimalFactory getNewAnimal() {
        return new AnimalFactory();
    }
}
