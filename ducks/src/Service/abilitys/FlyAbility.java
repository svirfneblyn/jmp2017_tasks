package Service.abilitys;

/**
 * Created by Ihar_Rubanovich on 2/14/2017.
 */
public class FlyAbility  implements IAbility{
    public void  fly(){
        System.out.println("FlY ability");
    }

    @Override
    public String execute() {
        fly();
        return "fly ability executed";
    }
}
