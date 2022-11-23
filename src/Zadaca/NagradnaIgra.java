package Zadaca;

import java.util.Arrays;
import java.util.Scanner;

public class NagradnaIgra {
    public static void main(String[] args) {
        int[] dobitniBrojevi = {13, 88, 49, 56, 27, 66, 33, 91};
        int broj;
        double nagrada = 10000.0, osvojenaNagrada = 10000.0;
        int brojUlaganja = 0;

        TESTIRANJE:
        for (; ; ) {
            brojUlaganja++;
            int[] mojiBrojevi = new int[1];
            System.out.println("Unesite " + (brojUlaganja) + ". pokusaj:");
            for (int i = 0; i < 8; i++) {
                broj = new Scanner(System.in).nextInt();
                mojiBrojevi[i] = broj;
                mojiBrojevi = Arrays.copyOfRange(mojiBrojevi, 0, mojiBrojevi.length + 1);
                for (int j : dobitniBrojevi) {
                    if (mojiBrojevi[i] == j) {
                        System.out.println("Pogodili ste i osvojili nagradu od: ");
                        System.out.println(osvojenaNagrada + " $");
                        break TESTIRANJE;
                    }
                }
            }
            osvojenaNagrada = osvojenaNagrada - nagrada * 0.3;
            if (osvojenaNagrada <= 0) {
                System.out.println("Sve ste para izgubili. Cestitamo");
                break;
            }
        }
    }
}