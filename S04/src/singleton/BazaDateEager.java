package singleton;

public class BazaDateEager {

    private String denumire;
    private int numarCampuri;


    private BazaDateEager(String denumire, int numarCampuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }

    @Override
    public String toString() {
        return "singleton.BazaDateEager{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }

    private static final BazaDateEager instanta =new  BazaDateEager("BD",2);

    public static BazaDateEager getInstanta(){
        return  instanta;
    }
}
