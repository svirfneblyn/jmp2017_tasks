package concreteDucks;

import Service.AbilityFactory;
import model.Duck;

/**
 * Created by User on 2/11/2017.
 */
public class QuackDuck extends Duck {
    private AbilityFactory af;
    public QuackDuck(AbilityFactory af) {
        super();
        this.af = af;

    }
    public void swim() {
        af.getAbility("swim").execute();
    }
    public void quack() {
        af.getAbility("quack").execute();
    }

    @Override
    public void showAbilitys() {
        System.out.println("QuackDuck abilitys : ");
        quack();
        swim();
    }
}
