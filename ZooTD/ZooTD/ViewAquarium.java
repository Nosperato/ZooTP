package ZooTD;

/**
 * Created by Administrateur on 04/11/2016.
 */
public class ViewAquarium extends ViewEnclosure{

    public void showCaracAquarium(String name, int area, int dept ,int maxAnimals, int nbAnimals, String cleanness, boolean salinity ,boolean isCleanable) {
        System.out.println("Les caractéristiques de l'enclos : \n" +
                "\t - Nom : " + name + "\n" +
                "\t - Superficie : " + area + "m²\n" +
                "\t - Profondeur : " + dept + "m\n" +
                "\t - Nombre maximal d'animaux pour l'enclos : " + maxAnimals + " \n" +
                "\t - Nombre d'animaux présents dans l'enclos : " + nbAnimals + " \n" +
                "\t - Propreté : " + cleanness + "\n" +
                "\t - Salinité : " + salinity + "\n" +
                "\t - Netoyable: " + isCleanable + "\n");

    }

    public void showErrAdd4() {
        System.out.println("Un aquarium ne peut pas contenir d'animal autre que marin \n");
    }

    public void showErrSalinity() {
        System.out.println("La salinité n'est pas bonne \n");
    }

    public void showSalinitySucc() {
        System.out.println("La salinité est remise à niveau \n");
    }

    public void showErrDept() {
        System.out.println("La profondeur n'est pas bonne");
    }

    public void showDeptSucc() {
        System.out.println("La profondeur est rétablie.");
    }
}
