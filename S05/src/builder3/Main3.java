package builder3;
import builder3.Pacient;
import builder1.BuilderPacient;
import builder1.IBuilderPacient;

public class Main3 {
    public static void main(String[] args) {
        Pacient pacient = new Pacient.Builder()
                .setNume("Andrei")
                .setAreMicDejun(true)
                .setArePapuciDeCamera(true)
                .build();

        System.out.println(pacient);


    }
}
