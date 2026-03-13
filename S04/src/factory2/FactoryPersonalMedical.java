package factory2;

import static factory2.TipPersonalMedical.MEDIC;

public class FactoryPersonalMedical extends FactoryPersonal {

    @Override
    public Registrator getPersonal(TipPersonalSpital personalSpital) {

        switch (personalSpital) {

            case MEDIC -> {
                return new Medic();
            }

            default -> throw new IllegalArgumentException("Tip personal medical necunoscut");
        }
    }
}