package Service;

import Service.abilitys.*;

/**
 * Created by Ihar_Rubanovich on 2/14/2017.
 */
public class AbilityFactory {
    public IAbility getAbility(String typeAbility) {
        switch (typeAbility) {
            case ("fly"):
                return new FlyAbility();

            case ("sing"):
                return new SingAbility();

            case ("quack"):
                return new QuackAbility();

            case ("swim"):
                return new SwimAbility();

            default:
                return new SwimAbility();
        }
    }
}
