package concreteDucks;

import Service.AbilityFactory;
import model.Duck;

/**
 * Created by User on 2/11/2017.
 */
public class ToyDuck extends Duck {

    private AbilityFactory af;
    public ToyDuck(AbilityFactory af) {
        super();
        this.af = af;
    }

    public void swim() {
        af.getAbility("swim").execute();
    }

    public void sing() {
        af.getAbility("sing").execute();
    }

    @Override
    public void showAbilitys() {
        System.out.println("ToyDuck abilitys : ");
        swim();
        sing();
    }
}
