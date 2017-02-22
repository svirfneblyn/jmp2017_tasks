package Service.abilitys;

/**
 * Created by Ihar_Rubanovich on 2/14/2017.
 */
public class SwimAbility  implements IAbility{
    public void swim() {
        System.out.println("Swim ability ");
    }

    @Override
    public String execute() {
        swim();
        return " swim ability executed";
    }
}
