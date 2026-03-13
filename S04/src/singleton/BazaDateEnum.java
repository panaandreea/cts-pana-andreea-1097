package singleton;

public enum BazaDateEnum {
    instanta;

    private String denumire;
    private int numarCampuri;


    private BazaDateEnum() {
        this.denumire = "BD";
        this.numarCampuri = 10;
    }

    @Override
    public String toString() {
        return "BazaDeDateLazy{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}