package ZooTD;

/**
 * Created by d13002386 on 10/10/2016.
 */
public interface AnimalAction {

    public void eat(int i);
    public void makeSound();
    public boolean changeCondition();
    public void treat();
    public void move();
    public void mate(Animal a);
}
