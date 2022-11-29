package Zadaca;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NagradnaIgra {
    public static void main(String[] args) {
        Random randomBrojevi = new Random();
        int[] dobitniBrojevi = new int[5];
        for (int i = 0; i < dobitniBrojevi.length; i++) {
            dobitniBrojevi[i] = randomBrojevi.nextInt(50);
            //System.out.print(dobitniBrojevi[i] + " ");5
            if (i == 0) {
                continue;
            }
            for(int j=0; j<dobitniBrojevi.length; j++){
                if (i==j){
                    continue;
                }
                if(dobitniBrojevi[j]==dobitniBrojevi[i]){
                    i--;
                }
            }
        }
        int broj;
        double nagrada = 10000.0, osvojenaNagrada = 10000.0;
        int brojUlaganja = 0;
        System.out.println("Dobrodosli u novu nagradnu igru u kojoj mozete osvojiti 10,000 $. Imate 4 pokusaja. " +
                "U svakom pokusaju unosite 5 brojeva. Nakon svakog unosa pritisnite enter (0 - 50).");

        TESTIRANJE:
        for (; ; ) {
            brojUlaganja++;
            int[] mojiBrojevi = new int[1];
            System.out.println("Unesite " + (brojUlaganja) + ". pokusaj:");
            for (int i = 0; i < 5; i++) {
                broj = new Scanner(System.in).nextInt();
                mojiBrojevi[i] = broj;
                mojiBrojevi = Arrays.copyOfRange(mojiBrojevi, 0, mojiBrojevi.length + 1);
                for (int k : dobitniBrojevi) {
                    if (mojiBrojevi[i] == k) {
                        System.out.println("Pogodili ste i osvojili nagradu od: ");
                        System.out.println(osvojenaNagrada + " $");
                        break TESTIRANJE;
                    }
                }
                System.out.println("upss. To nije trazeni broj");
            }
            osvojenaNagrada = osvojenaNagrada - nagrada * 0.3;
            if (osvojenaNagrada <= 0) {
                System.out.println("Sve ste para izgubili. Cestitamo");
                break;
            }
        }
        System.out.println("Dobitni brojevi su: ");
        for (int i : dobitniBrojevi) {
            System.out.print(i + " ");
        }
    }
}