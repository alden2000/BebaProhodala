package ZadaciZaVjezbu;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        int pomBroj;
        System.out.println("Unes broj clanova niza: ");
        int brojClanova = new Scanner(System.in).nextInt();
        System.out.println("Unesi niz: ");
        int clanovi[] = new int[20];
        for (int i = 0; i < brojClanova; i++) {
            pomBroj = new Scanner(System.in).nextInt();
            clanovi[i] = pomBroj;
        }
        if (clanovi[0] == clanovi[brojClanova - 1]) {
            for (int i = 0; i < brojClanova; i++) {
                System.out.print("Vas niz je: " + clanovi[i] + " ");
            }
        } else {
            System.out.println("Prvi i poslijednji clan nisu isti.");
        }
    }
}
