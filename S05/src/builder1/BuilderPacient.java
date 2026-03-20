package builder1;

public class BuilderPacient implements IBuilderPacient{

    private Pacient pacient;

    public BuilderPacient() {
        this.pacient=new Pacient();
    }

    @Override
    public Pacient buildPacient() {
        return this.pacient;
    }

    @Override
    public IBuilderPacient setArePatRabatabil(Boolean arePatRabatabil) {
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    @Override
    public IBuilderPacient setAreMicDejun(Boolean areMicDejun) {
        this.pacient.setAreMicDejun(areMicDejun);
        return this;
    }

    @Override
    public IBuilderPacient setArePapuciDeCamera(Boolean arePapuciDeCamera) {
        this.pacient.setArePapuciDeCamera(arePapuciDeCamera);
        return  this;
    }

    @Override
    public IBuilderPacient setHalat(Boolean areHalat) {
        this.pacient.setAreHalat(areHalat);
        return this;
    }

    @Override
    public IBuilderPacient setNume(String nume) {
        this.pacient.setNume(nume);
        return  this;
    }



}
