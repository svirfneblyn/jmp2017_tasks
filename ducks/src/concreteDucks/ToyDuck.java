package concreteDucks;

import Service.AbilityFabrique;
import model.Duck;

/**
 * Created by User on 2/11/2017.
 */
public class ToyDuck extends Duck {
    /*Uses common ability and one own from Singelton fabrique */
    @Override
    public void swim() {
        super.swim();
    }

    public void sing() {
        AbilityFabrique.getInstance().sing();
    }

    @Override
    public void abilitysDemo() {
        System.out.println("ToyDuck abilitys : ");
        swim();
        sing();
    }
}
