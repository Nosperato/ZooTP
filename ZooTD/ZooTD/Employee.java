package ZooTD;

/**
 * Created by Administrateur on 01/11/2016.
 */
public class Employee {

    private String name;
    private char sex;
    private int age;
    private ViewEmployee view;

    public Employee(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.view = new ViewEmployee();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void inspect(Enclosure enclosure) {
        enclosure.getCaracteristics();
    }

    public void clean(Enclosure enclosure) {
        enclosure.clean();
    }

    public void feed(Enclosure enclosure) {
        enclosure.feed();
    }

    public ViewEmployee getView() {
        return view;
    }

    public void setView(ViewEmployee view) {
        this.view = view;
    }

    public void relocate(Enclosure enclosure1, Enclosure enclosure2) {
        Animal a = enclosure1.getAnimalsList().get(enclosure1.getAnimalsList().size()-1);
        enclosure1.removeAnimal();
        enclosure2.addAnimal(a);
        this.getView().showRelocateSucc();

    }
}
