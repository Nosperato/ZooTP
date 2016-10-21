package ZooTD;

/**
 * Created by d13002386 on 10/10/2016.
 */
public class Tiger extends Mammal{
    public Tiger(String name, char sex, int weight, int height, int age, int durationGestation) {

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

    public void eat() {
        if(!this.getSleepIndicator()) {
            this.setHungerIndicator(true);
            System.out.println("Le tigre mange. \n");
        }
        else
            System.out.println("Le tigre n'a pas faim. \n");
    }

    public void makeSound() {
        System.out.println("Tiger : *Hurlement* \n");
    }

    public void changeCondition() {
        if(this.getSleepIndicator()) {//dort
            this.setSleepIndicator(false);
            System.out.println("Le tigre se réveille.\n");
        }else {//eveillé
            this.setSleepIndicator(true);
            System.out.println("Le tigre s'endort.\n");
        }
    }

    public void move() {
        System.out.println("Le tigre vagabonde. \n");
    }

    public Tiger birth() {
        if(this.getSex() == 'm')
            System.out.println("un male ne peut pas accoucher");
        else if(this.getCurrentDurationGestation() != this.getDurationGestation()) {
            System.out.println("La durée des gestion n'est pas encore atteinte");
        }else {
            int rand = (int)( Math.random()*( 2 - 1 + 1 ) ) + 1;
            char s;
            if (rand == 1)
                s = 'm';
            else
                s = 'f';
            return new Tiger(this.getName(), s, 2, 80, 0, this.getDurationGestation());
        }
        return null;
    }

    public void treat(){
        if(!this.getHealthIndicator()) {
            this.setHealthIndicator(true);
            System.out.println("Le tigre est soigné. \n");
        }
        else
            System.out.println("Santé normale");
    }

    public void mate(Mammal l) {
        if(this.isPregnant() || l.isPregnant())
            System.out.println("La tigresse est deja en période de gestation.\n");
        else if(this.getSex() == 'm' && l.getSex() == 'm' || this.getSex() == 'f' && this.getSex() == 'f')
            System.out.println("Seul un mal et une femelle peuvent s\'accoupler.\n");
        else if(this.getSleepIndicator() || l.getSleepIndicator())
            System.out.println("Un tigre dort.\n");
        else
            this.setPregnant(true);
    }
}
