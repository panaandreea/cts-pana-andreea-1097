package builder1;

public class Main1 {
    public static void main(String[] args) {
        IBuilderPacient builderPacient = new BuilderPacient();
        Pacient pacient = builderPacient.setNume("Andrei").setAreMicDejun(true).buildPacient();

        System.out.println(pacient);



    }
}
