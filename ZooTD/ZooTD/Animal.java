package ZooTD;

/**
 * Created by d13002386 on 07/10/2016.
 */
public abstract class Animal implements AnimalAction{

    private String name;
    private char sex;
    private int weight;
    private int height;
    private int age;
    private boolean hungerIndicator;
    private boolean sleepIndicator;
    private boolean healthIndicator;
    private boolean pregnant;
    private int durationGestation;//month
    private int currentDurationGestation;
    private ViewAnimal view = new ViewAnimal();


    public void setPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }

    public int getCurrentDurationGestation() {
        return currentDurationGestation;
    }

    public int getDurationGestation() {
        return durationGestation;
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public void setCurrentDurationGestation(int currentDurationGestation) {
        this.currentDurationGestation = currentDurationGestation;
    }

    public void setDurationGestation(int durationGestation) {

        this.durationGestation = durationGestation;
    }
    public int getHeight() {
        return this.height;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getHungerIndicator() {
        return this.hungerIndicator;
    }

    public boolean getSleepIndicator() {
        return this.sleepIndicator;
    }

    public boolean getHealthIndicator() {
        return this.healthIndicator;
    }

    public int getWeight() {
        return this.weight;
    }

    public char getSex() {
        return this.sex;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHungerIndicator(boolean hungerIndicator) {
        this.hungerIndicator = hungerIndicator;
    }

    public void setSleepIndicator(boolean sleepIndicator) {
        this.sleepIndicator = sleepIndicator;
    }

    public void setHealthIndicator(boolean healthIndicator) {
        this.healthIndicator = healthIndicator;
    }

    public void eat(int i) {
        if(!this.getSleepIndicator()) {
            if(!this.getHungerIndicator())
                this.getView().showNotHungry(this.getName() + " n°" + (i+1) + " ");
            else {
                this.setHungerIndicator(false);
                this.getView().showEat(this.getName() + " n°" + (i+1) + " ");
            }
        }
        else
            this.getView().showErrEat(this.getName());
    }

    public void makeSound() {

        this.getView().showMakeSoud(this.getName());
    }

    //endormir ou reveiller
    public boolean changeCondition() {
        if(this.getSleepIndicator()) {//dort
            this.setSleepIndicator(false);
            return this.getSleepIndicator();
        }else {//eveillé
            this.setSleepIndicator(true);
            return this.getSleepIndicator();
        }
    }

    public void move() {
        this.getView().showMove(this.getName());
    }

    public void treat() {
        if(!this.getHealthIndicator()) {
            this.setHealthIndicator(true);
            this.getView().showTreat(this.getName());
        }
        else
            this.getView().showErrTreat();
    }

    public ViewAnimal getView() {
        return this.view;
    }

    //s'accoupler
    public void mate(Animal a) {
        if(!this.getClass().getSimpleName().equals(a.getClass().getSimpleName()))
            this.getView().showErrMate();
        else {
            if (this.isPregnant())
                this.getView().showErrMate1(this.getName());
            else if (a.isPregnant())
                this.getView().showErrMate1(a.getName());
            else if (this.getSex() == 'm' && a.getSex() == 'm' || this.getSex() == 'f' && this.getSex() == 'f')
                this.getView().showErrMate2();
            else if (this.getSleepIndicator() || a.getSleepIndicator())
                this.getView().showErrMate3(this.getName());
            else {
                if (this.getSex() == 'f')
                    this.setPregnant(true);
                else
                    a.setPregnant(true);
            }
        }
    }
}
