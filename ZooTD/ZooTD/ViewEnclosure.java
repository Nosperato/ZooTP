package ZooTD;

/**
 * Created by Administrateur on 04/11/2016.
 */
public class ViewEnclosure {

    public void showCarac(String name, int area, int maxAnimals, int nbAnimals, String cleanness, boolean isCleanable) {
        System.out.println("Les caractéristiques de l'enclos : \n" +
                "\t - Nom : " + name + "\n" +
                "\t - Superficie : " + area + "m²\n" +
                "\t - Nombre maximal d'animaux pour l'enclos : " + maxAnimals + " \n" +
                "\t - Nombre d'animaux présents dans l'enclos : " + nbAnimals + " \n" +
                "\t - Propreté : " + cleanness + "\n" +
                "\t - Netoyable: " + isCleanable + "\n");
    }

    public void showErrCaracAnimals() {
        System.out.println("Les caractéristiques des animaux de l'enclos : Aucun animal présent dans l'enclos");
    }

    public void showInfoCaracAnimals() {
        System.out.println("Les caractéristiques des animaux de l'enclos : \n\n");
    }

    public void showCaracAnimals(String name, char sex, int weight, int height, int age, boolean hunger, boolean sleep, boolean health,
    boolean isPregnant) {
        System.out.println("\t - Nom : " + name + "\n" +
                "\t - Sexe : " + sex + "\n" +
                "\t - Poids : " + weight + "kg\n" +
                "\t - Taille : " + height + "cm\n" +
                "\t - Age : " + age + "\n" +
                "\t - Faim : " + hunger + "\n" +
                "\t - Endormi : " + sleep + "\n" +
                "\t - Santé : " + health);
        if (sex == 'f')
            System.out.println("\t - Enceinte : " + isPregnant + "\n");

        System.out.println("\n \n");
    }

    public void showErrAdd() {
        System.out.println("L'enclos possède deja le nombre maximal d'animaux \n");
    }

    public void showErrAdd2() {
        System.out.println("Un enclos standard ne peut pas contenir d'animal marin ou volant \n");
    }

    public void showAddSucc() {
        System.out.println("L'animal à été rajouté !");
    }

    public void showErrAdd3(String name) {
        System.out.println("L'animal n'est pas de la meme race que ceux de l'enclos. Il y a des " + name
                + "\n");
    }

    public void showRemoveSucc() {
        System.out.println("L'animal à été retiré \n");
    }

    public void showBeCleanableSucc() {
        System.out.println("Les animaux sont en cage \n");
    }

    public void showErrBeCleanable(String name) {
        System.out.println("L'enclos n'est pas sale : " + name + "\n");
    }
}
