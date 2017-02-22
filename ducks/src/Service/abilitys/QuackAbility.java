package Service.abilitys;

/**
 * Created by Ihar_Rubanovich on 2/14/2017.
 */
public class QuackAbility implements  IAbility{
    public void quack(){
        System.out.println("QUACK ability");
    }

        @Override
        public String execute() {
            quack();
            return "quack ability executed";
        }

}