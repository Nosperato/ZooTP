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

}
