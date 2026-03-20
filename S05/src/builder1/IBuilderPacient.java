package builder1;

public interface IBuilderPacient {
    Pacient buildPacient();

    IBuilderPacient setArePatRabatabil(Boolean arePatRabatabil);
    IBuilderPacient setAreMicDejun(Boolean areMicDejun);
    IBuilderPacient setArePapuciDeCamera(Boolean arePapuciDeCamera);
    IBuilderPacient setHalat(Boolean areHalat);
    IBuilderPacient setNume(String nume);


}
