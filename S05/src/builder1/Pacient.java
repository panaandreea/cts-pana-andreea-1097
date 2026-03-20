package builder1;

public class Pacient {
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCamera;
    private boolean areHalat;
    private String nume;


    public Pacient() {
        this.arePatRabatabil=false;
        this.areMicDejun=false;
        this.arePapuciDeCamera=false;
        this.areHalat=false;
        this.nume="Anonim";
    }


    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    protected void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    protected void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuciDeCamera=" + arePapuciDeCamera +
                ", areHalat=" + areHalat +
                ", nume='" + nume + '\'' +
                '}';
    }
}
