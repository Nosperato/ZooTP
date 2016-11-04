package ZooTD;

/**
 * Created by d13002386 on 10/10/2016.
 */
public abstract class Other extends Animal implements OtherAction{

    private ViewOther viewOther;

    public ViewOther getViewOther() {
        return viewOther;
    }

    public void setViewOther(ViewOther viewOther) {
        this.viewOther = viewOther;
    }
}
