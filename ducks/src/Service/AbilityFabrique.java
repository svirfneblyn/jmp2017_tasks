package Service;

/**
 * Created by User on 2/11/2017.
 */
public class AbilityFabrique {
    /*Singelton with ducks ability*/
    private static  AbilityFabrique instance ;

    private AbilityFabrique() {
    }

    public void fly(){
        System.out.println("FlY ability");
    }
    public void quack(){
        System.out.println("QUACK ability");
    }
    public void sing(){
        System.out.println("SING ability");
    }

    public static AbilityFabrique getInstance(){
        if (instance == null) {
            instance = new AbilityFabrique();
        }
        return instance;
    }
}
