package prototype2;

import java.util.Arrays;

public class MainPrototype2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        RetetaMedicament retetaMedicament =
                new RetetaMedicament("m1",
                        Arrays.asList(new Solutie("s1", 10.1)));

        RetetaMedicament copieRetetaMedicament =
                (RetetaMedicament) retetaMedicament.cloneaza();

        System.out.println(retetaMedicament);
        System.out.println(copieRetetaMedicament);
        System.out.println(retetaMedicament == copieRetetaMedicament);

        System.out.println("============");

        retetaMedicament.getSolutii().get(0).setCantitate(20.1);

        System.out.println(retetaMedicament);
        System.out.println(copieRetetaMedicament);
        System.out.println(retetaMedicament == copieRetetaMedicament);
    }
}