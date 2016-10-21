package ZooTD;

import java.util.ArrayList;

/**
 * Created by d13002386 on 07/10/2016.
 */
public class Zoo {

    private String name;
    private Employee employee;
    private int maxEnclos;
    private ArrayList<Enclosure> enclosureList;

    public Zoo(String name, Employee employee, int maxEnclosure) {
        this.name = name;
        this.employee = employee;
        this.maxEnclosure = maxEnclosure;
        this.enclosureList = new ArrayList<Enclosure>();
    }

}
