package singleton;

public class BazaDateHelper {

    private String denumire;
    private int numarCampuri;

    private static class BazaDeDateHelper {
        private static final BazaDateHelper instanta = new BazaDateHelper();
    }

    public static BazaDateHelper getInstanta() {
        return BazaDeDateHelper.instanta;
    }

    private BazaDateHelper() {
        this.denumire = "BD";
        this.numarCampuri = 10;
    }

    @Override
    public String toString() {
        return "singleton.BazaDateHelper{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}