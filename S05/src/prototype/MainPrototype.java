package prototype;

import java.util.HashMap;
import java.util.Map;

public class MainPrototype {
    public static void main(String[] args) {
        RetetaMedicament retetaMedicament = new RetetaMedicament("m1", Map.of("s1", 1000.0));

        RetetaMedicament copieRetetaMedicament = (RetetaMedicament) retetaMedicament.cloneaza();

        System.out.println(retetaMedicament);
        System.out.println(copieRetetaMedicament);
        System.out.println(retetaMedicament==copieRetetaMedicament);

        System.out.println("============");

        retetaMedicament.getSolutii().put("s1", 20.1);
        System.out.println(retetaMedicament);
        System.out.println(copieRetetaMedicament);
        System.out.println(retetaMedicament==copieRetetaMedicament);


    }
}
