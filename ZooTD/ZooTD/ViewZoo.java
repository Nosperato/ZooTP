package ZooTD;

/**
 * Created by Administrateur on 04/11/2016.
 */
public class ViewZoo {

    public void start() {
        System.out.println("\t \t Bienvenue dans la simulation de zoo (Edited by DUMOULIN Thibault & BRAGADO Yoan) \n\n" +
                "Veuillez rentrer le nom de l'employé : ");
    }

    public void showAskSex(String homme, String femme) {
        System.out.println("\nVeuillez choisir le sexe de l'employé : \n \t 1) " + homme + " \n\t 2) " + femme + " \n");
    }

    public void showErrAskSex() {
        System.out.println("Veuillez choisir \"1\" ou \"2\" \n");
    }

    public void showAskAge() {
        System.out.println("\n Veuillez rentrer l'age de l'employé : \n");
    }

    public void showErrAskAge() {
        System.out.println("Veuillez choisir un entier positif supérieur à 18 et inférieur à 70 pour l'age \n");
    }

    public void showCaracEmployee(String name, String choix, int age) {
        System.out.println("\n Détails de l'employé : \n" +
                "\t - Nom : " + name + "\n" +
                "\t - Sexe : " + choix + "\n" +
                "\t - Age : " + age + "\n");
    }

    public void showCreation() {
        System.out.println("Création en cours...... \n");
    }

    public void showEndCreation() {
        System.out.println("\n Zoo créé !\n");
    }

    public void showSimulationStart() {
        System.out.println("Commencement de la simulation... \n\n\n");
    }

    public void showWolfSick(int rand) {
        System.out.println("Le loup n°" + rand + " est malade \n");
    }

    public void showWolfHungry(int rand) {
        System.out.println("Le loup n°" + rand + " a faim \n");
    }

    public void showWolfSleep(int rand, boolean sleep) {
        if(!sleep)
            System.out.println("Le loup n°" + rand + "se réveille \n");
        else
            System.out.println("Le loup n°" + rand + " s'endort \n");
    }

    public void showEagleSick(int rand) {
        System.out.println("L'aigle n°" + rand + " est malade \n");
    }

    public void showEagleHungry(int rand) {
        System.out.println("L'aigle n°" + rand + " a faim \n");
    }

    public void showEagleSleep(int rand, boolean sleep) {
        if(!sleep)
            System.out.println("L'aigle n°" + rand + "se réveille \n");
        else
            System.out.println("L'aigle n°" + rand + " s'endort \n");
    }

    public void showSharkfSick(int rand) {
        System.out.println("Le requin n°" + rand + " est malade \n");
    }

    public void showSharkHungry(int rand) {
        System.out.println("Le requin n°" + rand + " a faim \n");
    }

    public void showSharkSleep(int rand, boolean sleep) {
        if(!sleep)
            System.out.println("Le requin n°" + rand + "se réveille \n");
        else
            System.out.println("Le requin n°" + rand + " s'endort \n");
    }

    public void showNbAnimalsZoo(int nb) {
        System.out.println("Il y a " + nb + " animaux dans le zoo \n");
    }

    public void showCleanStandardEnclusre() {
        System.out.println("L'enclos standard est propre \n");
    }

    public void showCleanBirdCage() {
        System.out.println("La volière est propre \n");
    }

    public void showCleanAquarium() {
        System.out.println("L'aquarium est propre \n");
    }

    public void showSort(int[] tabAge) {
        System.out.println("Affichage des ages des animaux par ordre croissant : \n");
        for(int j:tabAge){
            System.out.println(j);
        }
    }

    public void showErrChoice() {
        System.out.println("Veuillez choisir une action parmis celles proposées \n");
    }

    public void showEnd() {
        System.out.println("Arret du programme....");
    }

    public void showActionPlayer() {
        System.out.println("\nQue voulez-vous faire ? Vous pouvez faire 3 actions (Afficher des caractéristiques ne compte pas comme une action)\n" +
                "\t 1) Afficher toutes les informations concernant le zoo \n" +
                "\t 2) Afficher le nombre d'animaux présents dans le zoo \n" +
                "\t 3) Inspecter l'enclos standard \n" +
                "\t 4) Inspecter la volière \n" +
                "\t 5) Inspecter l'aquarium \n" +
                "\t 6) Nettoyer l'enclos standard \n" +
                "\t 7) Nettoyer la volière \n" +
                "\t 8) Nettoyer l'aquarium \n" +
                "\t 9) Nourrir les animaux de l'enclos standard \n" +
                "\t 10) Nourrir les animaux de la volière \n" +
                "\t 11) Nourrir les animaux de l'aquarium \n" +
                "\t 12) Afficher l'age des animaux dans l'odre croissant (tri rapide) \n" +
                "\t 13) Quitter la simulation \n");
    }

}
