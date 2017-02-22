package Service.abilitys;

/**
 * Created by Ihar_Rubanovich on 2/14/2017.
 */
public class SingAbility implements IAbility{
    public void sing() {
        System.out.println("SING ability");
    }

    @Override
    public String execute() {
        sing();
        return "Sing abilty executed";
    }
}
