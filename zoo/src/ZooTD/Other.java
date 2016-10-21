package ZooTD;

/**
 * Created by d13002386 on 10/10/2016.
 */
public abstract class Other extends Animal implements OtherAction{


    /*public Other lay() {
        if(this.getSex() == 'm')
            System.out.println("un male ne peut pas pondre");
        else if(this.getCurrentDurationGestation() != this.getDurationGestation()) {
            System.out.println("La durée des gestion n'est pas encore atteinte");
        }else {
            int rand = (int)( Math.random()*( 2 - 1 + 1 ) ) + 1;
            char s;
            if (rand == 1)
                s = 'm';
            else
                s = 'f';
            return new Other(this.getName(), s, 2, 80, 0, this.getDurationGestation());
        }
        return null;
    }*/

    /*public void mate(Other m) {
        if(this.isPregnant())
            System.out.println("l'animal est deja en période de gestation.");
        else if(this.getSex() == 'm' && m.getSex() == 'm' || this.getSex() == 'f' && this.getSex() == 'f')
            System.out.println("Seul un mal et une femelle peuvent s\'accoupler");
        else if(this.getSleepIndicator() || m.getSleepIndicator())
            System.out.println("Un animal dort");
        else
            this.setPregnant(true);
    }*/

}
