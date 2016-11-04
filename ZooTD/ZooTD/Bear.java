package ZooTD;

/**
 * Created by d13002386 on 10/10/2016.
 */
public class Bear extends Mammal {
    public Bear(String name, char sex, int weight, int height, int age, int durationGestation) {
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
    }

    public Bear birth() {
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
            return (Bear) factory.createAnimal("Ours", this.getName(), s, 2, 80, 0, this.getDurationGestation());
        }
        return null;
    }
}
