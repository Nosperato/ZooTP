package ZooTD;

/**
 * Created by Administrateur on 01/11/2016.
 */
public class BirdCage extends Enclosure{

    private int height;
    private boolean roofCondition;
    private ViewBirdCage viewBirdCage;

    public BirdCage(String name, int area, int maxAnimals, int height) {
        super(name, area, maxAnimals);
        this.height = height;
        this.roofCondition = true;
        this.viewBirdCage = new ViewBirdCage();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isRoofCondition() {
        return roofCondition;
    }

    public void setRoofCondition(boolean roofCondition) {
        this.roofCondition = roofCondition;
    }

    public ViewBirdCage getViewBirdCage() {
        return viewBirdCage;
    }

    @Override
    public void clean() {
        this.beCleanable();
        if(!this.isRoofCondition()) {
            this.getViewBirdCage().showErrRoof();
            this.setRoofCondition(true);
            this.getViewBirdCage().showRoofSucc();
        }
        this.setCleanness("Bon");
        uncaging(this);
    }

    @Override
    public void getCaracteristics() {
        this.getViewBirdCage().showCaracBirdCage(this.getName(), this.getArea(), this.getHeight(), this.getMaxAnimals(),
                this.getNbAnimals(), this.getCleanness(), this.isRoofCondition(), this.isCleanable());
        getCaracAnimals(this.getAnimalsList());
    }

    @Override
    public void addAnimal(Animal animal) {
        if (this.getNbAnimals() == this.getMaxAnimals())
            this.getViewBirdCage().showErrAdd();
        else {
            if (animal instanceof Flying && !(animal instanceof Marine))
                if (this.getAnimalsList().get(0) == null) {
                    this.getAnimalsList().remove(0);
                    this.getAnimalsList().add(animal);
                    this.setNbAnimals(this.getNbAnimals() + 1);
                    this.setCleanable(false);
                    this.getViewBirdCage().showAddSucc();
                } else {
                    if (!animal.getClass().getSimpleName().equals(this.getAnimalsList().get(0).getClass().getSimpleName()))
                        this.getViewBirdCage().showErrAdd3(this.getAnimalsList().get(0).getName());
                    else {
                        this.getAnimalsList().add(animal);
                        this.setNbAnimals(this.getNbAnimals() + 1);
                        this.getViewBirdCage().showAddSucc();
                    }
                }

            else {
                this.getViewBirdCage().showErrAdd4();
            }
        }
    }
}
