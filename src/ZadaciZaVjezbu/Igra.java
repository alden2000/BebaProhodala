package ZadaciZaVjezbu;

import java.util.Random;
import java.util.Scanner;

public class Igra {
    public static void main(String[] args) {
        int mojBroj, brojPokusaja=0;
        Random trazeniBroj = new Random();
        System.out.println("Zamislio sam broj probaj da ga pogodis ako mozes (0 - 20): ");
        int x = trazeniBroj.nextInt(20);
        do {
            mojBroj = new Scanner(System.in).nextInt();
            brojPokusaja++;
            if (mojBroj < x) {
                System.out.println("Moj broj je veci.");
            }
            if (mojBroj > x) {
                System.out.println("Moj broj je manji.");
            }
        } while (mojBroj != x);
        System.out.println("Cestitam. Tebalo ti je " + brojPokusaja + " pokusaja :)");
    }
}
