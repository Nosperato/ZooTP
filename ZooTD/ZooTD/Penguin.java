package ZooTD;

/**
 * Created by d13002386 on 10/10/2016.
 */
public class Penguin extends Other implements Flying, Marine{

    public Penguin(String name, char sex, int weight, int height, int age, int durationGestation) {

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
        this.setViewOther(new ViewOther());
    }

    public Other lay() {
        if(this.getSex() == 'm')
            this.getViewOther().showErrLay();
        else if(this.getCurrentDurationGestation() != this.getDurationGestation()) {
            this.getViewOther().showErrLay2();
        }else {
            int rand = (int)( Math.random()*( 2 - 1 + 1 ) ) + 1;
            char s;
            if (rand == 1)
                s = 'm';
            else
                s = 'f';
            AnimalFactory factory = AbstractAnimalFactocry.getNewAnimal();
            return (Penguin) factory.createAnimal("Pingouin", this.getName(), s, 2, 80, 0, this.getDurationGestation());
        }
        return null;
    }

    @Override
    public void swim() {
        this.getViewOther().showSwim(this.getName());
    }

    @Override
    public void fly() {
        this.getViewOther().showFlyPenguin(this.getName());
    }
}
