package factory;

public class FactoryPersonal {

    public static PersonalSpital getPersonal(TipPersonalSpital tipPersonalSpital) {

        switch (tipPersonalSpital) {

            case ASISTENT -> {
                return new Asistent();
            }

            case MEDIC -> {
                return new Medic();
            }

            case BRANCARDIER -> {
                return new Brancardier();
            }

            default -> throw new IllegalArgumentException("Tip personal necunoscut");
        }
    }
}