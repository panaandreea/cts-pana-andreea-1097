package flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PacientFlyweightFactory {
    private Map<String, Flyweight> flyweights;

    public PacientFlyweightFactory() {
        this.flyweights = new HashMap<>();
    }

    public Flyweight getFlyweights(String nume, String nrTelefon, String adresa) {
        if(!this.flyweights.containsKey(nrTelefon)){
            this.flyweights.put(nrTelefon, new PacientFlyweight(new Pacient(nume, nrTelefon, adresa )));
        }
        return this.flyweights.get(nrTelefon);
    }
}
