package ZooTD;

/**
 * Created by d13002386 on 10/10/2016.
 */
public class Awk extends Other{

    public Awk(String name, char sex, int weight, int height, int age, int durationGestation) {

        this.setName(name);
        this.setSex(sex);
        this.setWeight(weight);
        this.setHeight(height);
        this.setAge(age);
        this.setHungerIndicator(true);
        this.setSleepIndicator(false);
        this.setHealthIndicator(true);
        this.setPregnant(false);
        this.setDurationGestation(durationGestation);
        this.setCurrentDurationGestation(0);
    }

    public Other lay() {
        if(this.getSex() == 'm')
            System.out.println("un male ne peut pas pondre");
        else if(this.getCurrentDurationGestation() != this.getDurationGestation()) {
            System.out.println("La durée des gestion n'est pas encore atteinte");
        }else {
            int rand = (int)( Math.random()*( 2 - 1 + 1 ) ) + 1;
            char s;
            if (rand == 1)
                s = 'm';
            else
                s = 'f';
            return new Awk(this.getName(), s, 2, 80, 0, this.getDurationGestation());
        }
        return null;
    }
}
