package prototype2;

public class Solutie implements Cloneable {
    private String nume;
    private Double cantitate;

    public Solutie(String nume, Double cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Solutie{" +
                "nume='" + nume + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }

    @Override
    protected Solutie clone() throws CloneNotSupportedException {
        return (Solutie) super.clone();
    }

    public void setCantitate(Double cantitate) {
        this.cantitate = cantitate;
    }
}
