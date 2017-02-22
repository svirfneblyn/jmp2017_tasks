package Service;

import concreteDucks.FlyingDuck;
import concreteDucks.QuackDuck;
import concreteDucks.ToyDuck;
import model.Duck;

/**
 * Created by User on 2/11/2017.
 */
public class DuckFactory {
/*checks type and return needed Duck*/
    public Duck getDuck(String typeDuck) {
        AbilityFactory af = new AbilityFactory();
        if (typeDuck.equals("quack")) {
             return new QuackDuck(af);
        }
        if (typeDuck.equals("fly")) {

            return new FlyingDuck(af);
        }
        if (typeDuck.equals("toy")) {
            return new ToyDuck(af);
        }
        return null ;
    }

}
