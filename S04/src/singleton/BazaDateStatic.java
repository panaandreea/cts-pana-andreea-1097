package singleton;

public class BazaDateStatic {

    private String denumire;
    private int numarCampuri;
    private static BazaDateStatic instanta;

    static {
        try {
            instanta = new BazaDateStatic("Baza2", 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private BazaDateStatic(String denumire, int numarCampuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }

    @Override
    public String toString() {
        return "singleton.BazaDateStatic{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }

    public static BazaDateStatic getInstanta(){
        return  instanta;
    }
}
