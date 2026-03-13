package singleton;

public class BazaDateLazy {
    private String denumire;
    private int numarCampuri;

    private static BazaDateLazy instanta= null;

    public static BazaDateLazy getInstanta(String denumire, int numarCampuri){
        if(instanta == null)
        {
            instanta = new BazaDateLazy(denumire, numarCampuri);
        }
        return instanta;
    }

    private BazaDateLazy(String denumire, int numarCampuri) {
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