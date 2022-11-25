package ZadaciZaVjezbu;

import java.util.Scanner;

public class FudbalskiKlubDemo {
    public static void main(String[] args) {
        FudbalskiKlub klub1 = new FudbalskiKlub();
        klub1.setIme(new Scanner(System.in).nextLine());
        klub1.setGrad(new Scanner(System.in).nextLine());
        klub1.setDatiGolovi(new Scanner(System.in).nextInt());
        klub1.setPrimljeniGolovi(new Scanner(System.in).nextInt());
        klub1.ispis(klub1.getIme()+ " " + klub1.getGrad() + " " + klub1.getDatiGolovi() + " - " + klub1.getPrimljeniGolovi());

    }
}
