package olive;

import java.util.ArrayList;

/**
 * Created by mostafa on 25/12/15.
 */
public class OliveJar {


    //# very important question here how i do initialize this
    // thats simple just create static initializer :)
    public static ArrayList<Olive> olives;

    static {
        System.out.println("initializing");
        olives  = new ArrayList<>();
        olives.add(new Olive("Kalamata", 0x000000));
        olives.add(new Olive("Picholine", 0x00FF00));
        olives.add(new Olive("Kalamata", 0x000000));
    }


}
