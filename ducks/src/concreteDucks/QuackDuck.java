package concreteDucks;

import Service.AbilityFabrique;
import model.Duck;

/**
 * Created by User on 2/11/2017.
 */
public class QuackDuck extends Duck {

    @Override
    public void swim() {
        super.swim();
    }
public void quack(){
    AbilityFabrique.getInstance().quack();
}

    @Override
    public void abilitysDemo() {
        System.out.println("QuackDuck abilitys : " );
        quack();
        swim();
    }
}
