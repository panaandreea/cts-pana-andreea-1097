package singleton;

public class BazaDateThreadSafe {
    private String denumire;
    private int numarCampuri;

    private static BazaDateThreadSafe instanta= null;

    public static synchronized BazaDateThreadSafe getInstanta(String denumire, int numarCampuri){
        if(instanta == null)
        {
            instanta = new BazaDateThreadSafe(denumire, numarCampuri);
        }
        return instanta;
    }

    private BazaDateThreadSafe(String denumire, int numarCampuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }

    @Override
    public String toString() {
        return "BazaDeDateLazy{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}