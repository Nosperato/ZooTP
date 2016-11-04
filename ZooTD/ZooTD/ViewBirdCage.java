package ZooTD;

/**
 * Created by Administrateur on 04/11/2016.
 */
public class ViewBirdCage extends ViewEnclosure {

    public void showErrRoof() {
        System.out.println("Le toit n'est pas en bon etat \n");
    }

    public void showRoofSucc() {
        System.out.println("Le toit est réparé \n");
    }

    public void showCaracBirdCage(String name, int area, int height, int maxAnimals, int nbAnimals, String cleanness, boolean isRoofCondition,
                                boolean isCleanable) {
        System.out.println("Les caractéristiques de l'enclos : \n" +
                "\t - Nom : " + name + "\n" +
                "\t - Superficie : " + area + "m²\n" +
                "\t - Hauteur : " + height + "m\n" +
                "\t - Nombre maximal d'animaux pour l'enclos : " + maxAnimals + " \n" +
                "\t - Nombre d'animaux présents dans l'enclos : " + nbAnimals + " \n" +
                "\t - Propreté : " + cleanness + "\n" +
                "\t - Etat du toit : " + isRoofCondition + "\n" +
                "\t - Netoyable: " + isCleanable + "\n");
    }

    public void showErrAdd4() {
        System.out.println("Une volière ne peut pas contenir d'animal marin ou non volant \n");
    }
}
