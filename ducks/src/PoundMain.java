//test
import Service.DuckFactory;
import model.Duck;

import java.util.ArrayList;
import java.util.List;

public class PoundMain {

    public static void main(String[] args) {
        /*List with duck types*/
        List<String> duckTypekList = new ArrayList<>();
        duckTypekList.add("quack");
        duckTypekList.add("fly");
        duckTypekList.add("toy");

         /*List with concrete ducks */
        List<Duck> duckCreatsList = new ArrayList<>();

        System.out.println("Pound created. Feeling with ducks");
        DuckFactory df = new DuckFactory();
        /*Feel the Pound with Ducks*/
        for (String typeDuck : duckTypekList) {
            duckCreatsList.add(df.getDuck(typeDuck));
        }
        System.out.println("Ducks ready and there is the list of ducks and their abilities :");
        /*Ducks sweem in the pound and demonstrate abilities*/
        for (Duck duckType : duckCreatsList) {
            duckType.abilitysDemo();

        }
    }
}
