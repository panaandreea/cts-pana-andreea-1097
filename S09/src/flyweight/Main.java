package flyweight;

public class Main {
    public static void main(String[] args) {
        Salon salon1 = new Salon(1, 10, 30);
        Salon salon2 = new Salon(2, 20, 40);
        Salon salon3 = new Salon(3, 30, 50);
        Salon salon4 = new Salon(4, 40, 60);

        Pacient pacient = new Pacient("P", "adresa", "s");

    }
}
