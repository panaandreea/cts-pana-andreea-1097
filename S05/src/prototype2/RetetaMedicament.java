package prototype2;

import prototype2.RetetaClonable;
import prototype2.Solutie;

import java.util.ArrayList;
import java.util.List;

public class RetetaMedicament implements RetetaClonable {
    private String nume;
    private List<Solutie> solutii;

    public RetetaMedicament(String nume, List<Solutie> solutii) throws CloneNotSupportedException {
        this.nume = nume;
        this.solutii = new ArrayList<>();

        for (Solutie s : solutii) {
            this.solutii.add(s.clone());
        }
    }

    public RetetaMedicament(RetetaMedicament retetaMedicament) throws CloneNotSupportedException {
        this.nume = retetaMedicament.nume;
        this.solutii = new ArrayList<>();

        for (Solutie s : retetaMedicament.solutii) {
            this.solutii.add(s.clone());
        }
    }

    public List<Solutie> getSolutii() {
        return solutii;
    }

    @Override
    public RetetaClonable cloneaza() throws CloneNotSupportedException {
        return new RetetaMedicament(this);
    }
}