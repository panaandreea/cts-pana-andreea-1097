package builder2;

import builder1.BuilderPacient;
import builder1.IBuilderPacient;
import builder1.Pacient;

public class Main2 {
    public static void main(String[] args) {
        IBuilderPacient builderPacient = new BuilderPacient();
        Pacient pacient = builderPacient.setNume("Andrei").setAreMicDejun(true).buildPacient();

        System.out.println(pacient);


    }
}
