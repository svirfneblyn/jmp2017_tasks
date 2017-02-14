package concreteDucks;

import Service.AbilityFactory;
import model.Duck;

/**
 * Created by User on 2/11/2017.
 */
public class FlyingDuck extends Duck {
 private   AbilityFactory af;

    public FlyingDuck(AbilityFactory af) {
        super();
    this.af = af;
    }

    public void swim() {
        af.getAbility("swim").execute();
    }

    public void fly() {
        af.getAbility("fly").execute();
    }

    @Override
    public void showAbilitys() {
        System.out.println("FlyingDuck abilitys : " );
        fly();
        swim();
    }
}
