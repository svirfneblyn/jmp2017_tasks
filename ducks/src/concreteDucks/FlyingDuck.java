package concreteDucks;

import Service.AbilityFabrique;
import model.Duck;

/**
 * Created by User on 2/11/2017.
 */
public class FlyingDuck extends Duck {
    @Override
    public void swim() {
        super.swim();
    }

    public void fly() {
        AbilityFabrique.getInstance().fly();
    }

    @Override
    public void abilitysDemo() {
        System.out.println("FlyingDuck abilitys : " );
        fly();
        swim();
    }
}
