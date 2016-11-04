package ZooTD;

/**
 * Created by Administrateur on 04/11/2016.
 */
public class ViewAnimal {

    public void showNotHungry(String name) {
        System.out.println("Le " + name + " n'a pas faim \n");
    }

    public void showEat(String name) {
        System.out.println("Le " + name + " mange \n");
    }

    public void showErrEat(String name) {
        System.out.println("Le " + name + " dort et donc ne peut pas manger. \n");
    }

    public void showMakeSoud(String name) {
        System.out.println(name + " : *Cris* \n");
    }

    public void showMove(String name) {
        System.out.println("Le " + name + " vagabonde. \n");
    }

    public void showTreat(String name) {
        System.out.println("Le " + name + " est soigné. \n");
    }

    public void showErrTreat() {
        System.out.println("Santé normale");
    }

    public void showErrMate() {
        System.out.println("Deux races différentes ne peuvent pas s'accoupler. \n");
    }

    public void showErrMate1(String name) {
        System.out.println(name + " est deja en période de gestation.\n");
    }

    public void showErrMate2() {
        System.out.println("Seul un mal et une femelle peuvent s\'accoupler.\n");
    }

    public void showErrMate3(String name) {
        System.out.println("Un " + name + " dort.\n");
    }
}
