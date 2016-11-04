package ZooTD;

/**
 * Created by Administrateur on 01/11/2016.
 */
public class Aquarium extends Enclosure {

    private int dept;
    private boolean salinity;
    private ViewAquarium viewAquarium;

    public Aquarium(String name, int area, int maxAnimals, int dept) {
        super(name, area, maxAnimals);
        this.dept = dept;
        this.salinity = true;
        this.viewAquarium = new ViewAquarium();
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public boolean isSalinity() {
        return salinity;
    }

    public void setSalinity(boolean salinity) {
        this.salinity = salinity;
    }

    public ViewAquarium getViewAquarium() {
        return viewAquarium;
    }

    @Override
    public void getCaracteristics() {
        this.getViewAquarium().showCaracAquarium(this.getName(), this.getArea(), this.getDept() ,this.getMaxAnimals(), this.getNbAnimals(), this.getCleanness(), this.isSalinity() ,this.isCleanable());
        getCaracAnimals(this.getAnimalsList());
    }

    @Override
    public void addAnimal(Animal animal) {
        if(this.getNbAnimals() == this.getMaxAnimals())
            this.getViewAquarium().showErrAdd();
        else {
            if (animal instanceof Marine && !(animal instanceof Flying) || animal instanceof Penguin)
                if (this.getAnimalsList().get(0) == null) {
                    this.getAnimalsList().remove(0);
                    this.getAnimalsList().add(animal);
                    this.setNbAnimals(this.getNbAnimals() + 1);
                    this.setCleanable(false);
                    this.getViewAquarium().showAddSucc();
                } else {
                    if (animal.getClass() != this.getAnimalsList().get(0).getClass())
                        this.getViewAquarium().showErrAdd3(this.getAnimalsList().get(0).getName());
                    else {
                        this.getAnimalsList().add(animal);
                        this.setNbAnimals(this.getNbAnimals() + 1);
                        this.getViewAquarium().showAddSucc();
                    }
                }

            else {
                this.getViewAquarium().showErrAdd4();
            }
        }
    }

    @Override
    public void clean() {
        if(!this.isSalinity()) {
            this.getViewAquarium().showErrSalinity();
            this.setSalinity(true);
            this.getViewAquarium().showSalinitySucc();
        }
        if(this.getDept() < 100) {
            this.getViewAquarium().showErrDept();
            this.setDept(100);
            this.getViewAquarium().showDeptSucc();
        }
        this.setCleanness("Bon");
        uncaging(this);
    }
}
