package ZooTD;

/**
 * Created by d13002386 on 10/10/2016.
 */
public class Shark extends Mammal implements Marine{
    public Shark(String name, char sex, int weight, int height, int age, int durationGestation) {

        this.setName(name);
        this.setSex(sex);
        this.setWeight(weight);
        this.setHeight(height);
        this.setAge(age);
        this.setHungerIndicator(false);
        this.setSleepIndicator(false);
        this.setHealthIndicator(true);
        this.setPregnant(false);
        this.setDurationGestation(durationGestation);
        this.setCurrentDurationGestation(0);
        this.setViewMammal(new ViewMammal());
        this.setViewMammal(new ViewMammal());
    }

    @Override
    public Mammal birth() {
        if(this.getSex() == 'm')
            this.getViewMammal().showErrBirth();
        else if(this.getCurrentDurationGestation() != this.getDurationGestation()) {
            this.getViewMammal().showErrBirth2();
        }else {
            int rand = (int)( Math.random()*( 2 - 1 + 1 ) ) + 1;
            char s;
            if (rand == 1)
                s = 'm';
            else
                s = 'f';
            AnimalFactory factory = AbstractAnimalFactocry.getNewAnimal();
            return (Shark) factory.createAnimal("Requin", this.getName(), s, 2, 80, 0, this.getDurationGestation());
        }
        return null;
    }

    @Override
    public void swim() {
        this.getViewMammal().showSwimShark(this.getName());
    }

    @Override
    public void move() {
        this.swim();
    }
}
