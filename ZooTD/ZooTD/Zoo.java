package ZooTD;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

//TODO algo de tri et MVC
/**
 * Created by d13002386 on 07/10/2016.
 */
public class Zoo {

    private String name;
    private Employee employee;
    private int maxEnclosure;
    private ArrayList<Enclosure> enclosureList;
    private ViewZoo viewZoo;

    public ViewZoo getViewZoo() {
        return viewZoo;
    }

    public void setViewZoo(ViewZoo viewZoo) {
        this.viewZoo = viewZoo;
    }

    public Zoo(String name, Employee employee, int maxEnclosure) {
        this.name = name;
        this.employee = employee;
        this.maxEnclosure = maxEnclosure;
        this.enclosureList = new ArrayList<Enclosure>();
        this.viewZoo = new ViewZoo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ArrayList<Enclosure> getEnclosureList() {
        return enclosureList;
    }

    public void setEnclosureList(ArrayList<Enclosure> enclosureList) {
        this.enclosureList = enclosureList;
    }

    public int getMaxEnclosure() {
        return maxEnclosure;
    }

    public void setMaxEnclosure(int maxEnclosure) {
        this.maxEnclosure = maxEnclosure;
    }

    public int getNbAnimals() {
        int compt = 0;
        for(Enclosure enclosure : this.getEnclosureList())
            for(Animal animal : enclosure.getAnimalsList())
                ++compt;
        return compt;
    }

    //afficher les caractéristiques des enclos du zoo
    public void getAll() {
        for(Enclosure enclosure : this.getEnclosureList()) {
            enclosure.getCaracteristics();
        }
    }

    public void addEnclosure(Enclosure e) {
        this.getEnclosureList().add(e);
    }

    //--------------------- MAIN ----------------------//

    public static void main(String[] args) {

        Zoo zooView = new Zoo("ZooView", null, 0);

        Scanner sc = new Scanner(System.in);

        zooView.getViewZoo().start();
        String employeeName = sc.nextLine();

        String homme = "Homme";
        String femme = "Femme";
        String choix;
        zooView.getViewZoo().showAskSex(homme, femme);
        int sexe;
        while(true) {
            try {
                sexe = Integer.parseInt(sc.nextLine());
                if (sexe == 1 || sexe == 2) {
                    break;
                }else {
                    zooView.getViewZoo().showErrAskSex();
                }
            }catch (NumberFormatException e) {
                zooView.getViewZoo().showErrAskSex();
            }
        }
        char s;
        if(sexe == 1) {
            s = 'm';
            choix = homme;
        }else {
            s = 'f';
            choix = femme;
        }


        zooView.getViewZoo().showAskAge();
        int age;
        while(true) {
            try {
                age = Integer.parseInt(sc.nextLine());
                if(age < 18 || age >70)
                    throw new NumberFormatException();
                break;

            }catch (NumberFormatException e) {
                zooView.getViewZoo().showErrAskAge();
            }
        }

        Employee employee = new Employee(employeeName, s, age);
        zooView.getViewZoo().showCaracEmployee(employee.getName(), choix, employee.getAge());

        //Création zoo
        Enclosure standardEnclosure = new Enclosure("Enclos standard", 600, 6);
        BirdCage birdCage           = new BirdCage("Volière", 100, 9, 10);
        Aquarium aquarium           = new Aquarium("Aquarium", 800, 5, 50);

        Wolf loup1 = new Wolf("Loup", 'f', 45, 80, 5, 10);
        Wolf loup2 = new Wolf("Loup", 'f', 40, 75, 3, 10);
        Wolf loup3 = new Wolf("Loup", 'm', 60, 85, 4, 10);

        Eagle aigle1 = new Eagle("Aigle Royal", 'm', 4, 200, 10, 5);
        Eagle aigle2 = new Eagle("Aigle Royal", 'f', 3, 180, 8, 5);
        Eagle aigle3 = new Eagle("Aigle Royal", 'f', 3, 170, 7, 5);

        Shark requin1 = new Shark("Requin Blanc", 'f', 800, 5000, 20, 10);
        Shark requin2 = new Shark("Requin Blanc", 'f', 900, 4000, 15, 10);
        Shark requin3 = new Shark("Requin Blanc", 'm', 1000, 6000, 35, 10);

        zooView.getViewZoo().showCreation();

        standardEnclosure.addAnimal(loup1);
        standardEnclosure.addAnimal(loup2);
        standardEnclosure.addAnimal(loup3);

        birdCage.addAnimal(aigle1);
        birdCage.addAnimal(aigle2);
        birdCage.addAnimal(aigle3);

        aquarium.addAnimal(requin1);
        aquarium.addAnimal(requin2);
        aquarium.addAnimal(requin3);

        Zoo zoo = new Zoo("Zoo", employee, 3);

        zoo.addEnclosure(standardEnclosure);
        zoo.addEnclosure(birdCage);
        zoo.addEnclosure(aquarium);

        zooView.getViewZoo().showEndCreation();

        System.out.println("Commencement de la simulation... \n\n\n");

        int action;
        int randAnim = 0;
        int randNbChangement;
        int randEvenement;
        boolean sleep;
        int flagArret = 0;

        while(true) {
            randNbChangement = (int)( Math.random()*( 5 - 1 + 1 ) ) + 1;
            for(int i = 0; i < randNbChangement; i++) {
               randEvenement = ((int)( Math.random()*( 15 - 1 + 1 ) ) + 1);
               switch(randEvenement) {
                    case 1:
                        zoo.getEnclosureList().get(0).setCleanness("sale");
                        break;
                    case 2:
                        zoo.getEnclosureList().get(1).setCleanness("Sale");
                        break;
                    case 3:
                        zoo.getEnclosureList().get(2).setCleanness("Sale");
                        break;
                    case 4:
                        birdCage.setRoofCondition(false);
                        birdCage.setCleanness("sale");
                        break;
                   case 5:
                       aquarium.setSalinity(false);
                       aquarium.setCleanness("sale");
                       break;
                   case 6:
                       aquarium.setDept(80);
                       aquarium.setCleanness("sale");
                       break;
                   case 7:
                       randAnim = (int)( Math.random()*(standardEnclosure.getAnimalsList().size()-1) + 1 );
                       standardEnclosure.getAnimalsList().get(randAnim).setHealthIndicator(false);
                       ++randAnim;
                       zooView.getViewZoo().showWolfSick(randAnim);
                       break;
                   case 8:
                       randAnim = (int)( Math.random()*(standardEnclosure.getAnimalsList().size()-1) + 1 );
                       standardEnclosure.getAnimalsList().get(randAnim).setHungerIndicator(true);
                       ++randAnim;
                       zooView.getViewZoo().showWolfHungry(randAnim);
                       break;
                   case 9:
                       randAnim = (int)( Math.random()*(standardEnclosure.getAnimalsList().size()-1) + 1);
                       sleep = standardEnclosure.getAnimalsList().get(randAnim).changeCondition();
                       ++randAnim;
                       zooView.getViewZoo().showWolfSleep(randAnim, sleep);
                       break;
                   case 10:
                       randAnim = (int)( Math.random()*(birdCage.getAnimalsList().size()-1) + 1 );
                       birdCage.getAnimalsList().get(randAnim).setHealthIndicator(false);
                       ++randAnim;
                       zooView.getViewZoo().showEagleSick(randAnim);
                       break;
                   case 11:
                       randAnim = (int)( Math.random()*(birdCage.getAnimalsList().size()-1) + 1 );
                       birdCage.getAnimalsList().get(randAnim).setHungerIndicator(true);
                       ++randAnim;
                       zooView.getViewZoo().showEagleHungry(randAnim);
                       break;
                   case 12:
                       randAnim = (int)( Math.random()*(birdCage.getAnimalsList().size()-1) + 1 );
                       sleep = birdCage.getAnimalsList().get(randAnim).changeCondition();
                       ++randAnim;
                       zooView.getViewZoo().showEagleSleep(randAnim, sleep);
                       break;
                   case 13:
                       randAnim = (int)( Math.random()*(aquarium.getAnimalsList().size()-1) + 1 );
                       aquarium.getAnimalsList().get(randAnim).setHealthIndicator(false);
                       ++randAnim;
                       zooView.getViewZoo().showSharkfSick(randAnim);
                       break;
                   case 14:
                       randAnim = (int)( Math.random()*(aquarium.getAnimalsList().size()-1) + 1 );
                       aquarium.getAnimalsList().get(randAnim).setHungerIndicator(true);
                       ++randAnim;
                       zooView.getViewZoo().showSharkHungry(randAnim);
                       break;
                   case 15:
                       randAnim = (int)( Math.random()*(aquarium.getAnimalsList().size()-1) + 1 );
                       sleep = aquarium.getAnimalsList().get(randAnim).changeCondition();
                       ++randAnim;
                       zooView.getViewZoo().showSharkSleep(randAnim, sleep);
                       break;
                   default:
                       break;
                }
            }
            int compt = 0;
            while (compt <= 3 && flagArret == 0) {
                zooView.getViewZoo().showActionPlayer();
                try {
                    action = Integer.parseInt(sc.nextLine());
                    switch (action) {
                        case 1:
                            zoo.getAll();
                            break;
                        case 2:
                            zooView.getViewZoo().showNbAnimalsZoo(zoo.getNbAnimals());
                            break;
                        case 3:
                            employee.inspect(standardEnclosure);
                            break;
                        case 4:
                            employee.inspect(birdCage);
                            break;
                        case 5:
                            employee.inspect(aquarium);
                            break;
                        case 6:
                            employee.clean(standardEnclosure);
                            ++compt;
                            zooView.getViewZoo().showCleanStandardEnclusre();
                            break;
                        case 7:
                            employee.clean(birdCage);
                            ++compt;
                            zooView.getViewZoo().showCleanBirdCage();
                            break;
                        case 8:
                            employee.clean(aquarium);
                            ++compt;
                            zooView.getViewZoo().showCleanAquarium();
                            break;
                        case 9:
                            employee.feed(standardEnclosure);
                            ++compt;
                            break;
                        case 10:
                            employee.feed(birdCage);
                            ++compt;
                            break;
                        case 11:
                            employee.feed(aquarium);
                            ++compt;
                            break;
                        case 12:
                            int i =0;
                            int[] tabAge = new int[zoo.getNbAnimals()];
                            for(Enclosure enclosure : zoo.getEnclosureList())
                                for(Animal animal : enclosure.getAnimalsList()) {
                                    tabAge[i] = animal.getAge();
                                    i++;
                                }
                            QuickSort sorter = new QuickSort();
                            sorter.sort(tabAge);
                            zooView.getViewZoo().showSort(tabAge);
                            break;
                        case 13:
                            flagArret = 1;
                            break;
                        default:
                            zooView.getViewZoo().showErrChoice();
                    }
                } catch (NumberFormatException e) {
                    zooView.getViewZoo().showErrChoice();
                }
            }
            if(flagArret == 1) {
                zooView.getViewZoo().showEnd();
                break;
            }
        }
    }
}
