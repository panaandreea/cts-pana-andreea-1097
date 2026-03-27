package factory2;

public class FactoryPersonalNonMedical extends FactoryPersonal {

    @Override
    public Registrator getPersonal(TipPersonalSpital personalSpital) {

        TipPersonalNonMedical tip = (TipPersonalNonMedical) personalSpital;

        switch (tip) {

            case REGISTRATOR -> {
                return new Registrator();
            }

            default -> throw new IllegalArgumentException("Tip personal non medical necunoscut!");
        }
    }
}