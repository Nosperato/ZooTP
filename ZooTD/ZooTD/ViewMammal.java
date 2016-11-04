package ZooTD;

/**
 * Created by Administrateur on 04/11/2016.
 */
public class ViewMammal {

    public void showErrBirth() {
        System.out.println("un male ne peut pas accoucher");
    }

    public void showErrBirth2() {
        System.out.println("La durée des gestion n'est pas encore atteinte");
    }

    public void showSwimWhale(String name) {
        System.out.println("La " + name + " nage. \n");
    }

    public void showSwimShark(String name) {
        System.out.println("Le " + name + " nage. \n");
    }
}
