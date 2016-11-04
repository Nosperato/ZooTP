package ZooTD;

/**
 * Created by Administrateur on 04/11/2016.
 */
public class AnimalFactory extends AbstractAnimalFactocry{

    public Animal createAnimal(String animal, String name, char sex, int weight, int height, int age, int durationGestation) {
        Animal newAnimal = null;
        switch (animal) {
            case "Ours":
                newAnimal = new Bear(name, sex, weight, height, age, durationGestation);
                break;
            case "Aigle":
                newAnimal = new Eagle(name, sex, weight, height, age, durationGestation);
                break;
            case "Pingouin":
                newAnimal = new Penguin(name, sex, weight, height, age, durationGestation);
                break;
            case "Poisson rouge":
                newAnimal = new RedFish(name, sex, weight, height, age, durationGestation);
                break;
            case "Requin":
                newAnimal = new Shark(name, sex, weight, height, age, durationGestation);
                break;
            case "Tigre":
                newAnimal = new Tiger(name, sex, weight, height, age, durationGestation);
                break;
            case "Baleine":
                newAnimal = new Whale(name, sex, weight, height, age, durationGestation);
                break;
            case "Loup":
                newAnimal = new Wolf(name, sex, weight, height, age, durationGestation);
        }
        return newAnimal;
    }
}
