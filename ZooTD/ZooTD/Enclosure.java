package ZooTD;

import java.util.ArrayList;

/**
 * Created by Administrateur on 31/10/2016.
 */

//perspective d'amélioration ==> faire ArrayList<Animal> list = new ArrayList<Loup>() exemple
public class Enclosure {

    private String name;
    private int area;
    private final int maxAnimals;
    private int nbAnimals;
    private ArrayList<Animal> animalsList;
    private String cleanness; //sale, correct, bon
    private boolean cleanable;
    private ArrayList<Animal> cages;
    private ViewEnclosure view;


    public Enclosure(String name, int area, int maxAnimals) {
        this.name = name;
        this.area = area;
        this.maxAnimals = maxAnimals;
        this.nbAnimals = 0;
        this.animalsList = new ArrayList<>();
        this.animalsList.add(null);
        this.cleanness = "Bon";
        this.cleanable = true;
        this.cages = new ArrayList<>();
        this.view = new ViewEnclosure();
    }

    public boolean isCleanable() {
        return cleanable;
    }

    public void setCleanable(boolean cleanable) {
        this.cleanable = cleanable;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return this.area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getMaxAnimals() {
        return this.maxAnimals;
    }

    public int getNbAnimals() {
        return this.nbAnimals;
    }

    public void setNbAnimals(int nbAnimals) {
        this.nbAnimals = nbAnimals;
    }

    public ArrayList<Animal> getAnimalsList() {
        return this.animalsList;
    }

    public String getCleanness() {
        return this.cleanness;
    }

    public void setCleanness(String cleanness) {
        this.cleanness = cleanness;
    }

    public ArrayList<Animal> getCages() {
        return cages;
    }

    public ViewEnclosure getView() {
        return view;
    }

    public void getCaracteristics() {
        this.getView().showCarac(this.getName(), this.getArea(), this.getMaxAnimals(), this.getNbAnimals(), this.getCleanness(), this.isCleanable());
        this.getCaracAnimals(this.getAnimalsList());
    }

    public void getCaracAnimals(ArrayList<Animal> list) {
        if(list.get(0) == null)
            this.getView().showErrCaracAnimals();
        else {
            this.getView().showInfoCaracAnimals();
            for (Animal animal : list) {
                this.getView().showCaracAnimals(animal.getName(), animal.getSex(), animal.getWeight(), animal.getHeight(), animal.getAge(),
                        animal.getHungerIndicator(), animal.getSleepIndicator(), animal.getHealthIndicator(), animal.isPregnant());
            }
        }
    }

    public void addAnimal(Animal animal) {
        if(this.getNbAnimals() == this.getMaxAnimals())
            this.getView().showErrAdd();
        else {
            if (animal instanceof Marine || animal instanceof Flying)
                this.getView().showErrAdd2();
            else {
                if (this.getAnimalsList().get(0) == null) {
                    this.getAnimalsList().remove(0);
                    this.getAnimalsList().add(animal);
                    this.setNbAnimals(this.getNbAnimals() + 1);
                    this.setCleanable(false);
                    this.getView().showAddSucc();
                } else {
                    if (animal.getClass() != this.getAnimalsList().get(0).getClass())
                        this.getView().showErrAdd3(this.getAnimalsList().get(0).getName());
                    else {
                        this.getAnimalsList().add(animal);
                        this.setNbAnimals(this.getNbAnimals() + 1);
                        this.getView().showAddSucc();
                    }
                }
            }
        }
    }

    public void removeAnimal() {
        if(this.getAnimalsList().size() == 1) {
            this.getAnimalsList().set(0, null);
            this.setCleanable(true);
            this.getView().showRemoveSucc();
        }else {
            this.getAnimalsList().remove(this.getAnimalsList().size() - 1);
            this.getView().showRemoveSucc();
        }
    }

    public void feed() {
        for(int i = 0; i < this.getAnimalsList().size(); i++)
            this.getAnimalsList().get(i).eat(i);
    }

    public static void caging(Enclosure enclosure) {
        for(int i = 0; i < enclosure.getAnimalsList().size(); i++) {
            Animal a = enclosure.getAnimalsList().get(i);
            enclosure.getAnimalsList().remove(i);
            enclosure.getCages().add(a);
        }
        enclosure.setCleanable(true);
    }

    public void beCleanable() {
        if(this.getCleanness().equals("sale")) {
            caging(this);
            this.getView().showBeCleanableSucc();
        } else
            this.getView().showErrBeCleanable(this.getName());
    }

    public void clean() {
        this.beCleanable();
        this.setCleanness("Bon");
        uncaging(this);
    }

    public static void uncaging(Enclosure enclosure) {
        for(int i = 0; i < enclosure.getCages().size(); i++) {
            Animal a = enclosure.getCages().get(i);
            enclosure.getCages().remove(i);
            enclosure.getAnimalsList().add(a);
        }
        enclosure.setCleanable(false);
    }
}
