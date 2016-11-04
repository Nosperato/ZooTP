package ZooTD;


public abstract class Mammal extends Animal implements MammalAction{
    public ViewMammal getViewMammal() {
        return viewMammal;
    }

    public void setViewMammal(ViewMammal viewMammal) {
        this.viewMammal = viewMammal;
    }

    private ViewMammal viewMammal;

}
