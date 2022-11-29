package Zadaca;

import java.util.Scanner;

public class BrojanjeSlova {
    public static void main(String[] args) {
        System.out.println("Unesi rijec:");
        String recenica = "karabaja mora dalje, karabaja naci mora, karabaja ne moze na nebo otic bez motora.";
        char[] razlozenaRecenica = recenica.toCharArray();
        int brojRijeci = 0;
        String trazenaRijec = new Scanner(System.in).nextLine();
        char[] razlozenaTrazenaRijec = trazenaRijec.toCharArray();
        for (int i = 0; i < razlozenaRecenica.length; i++) {
            int pomocniBrojac = 0;
            if (razlozenaRecenica[i] != razlozenaTrazenaRijec[0]) {
                continue;
            }
            for (int j = 0; j < razlozenaTrazenaRijec.length; j++) {
                if (razlozenaRecenica[i + j] == razlozenaTrazenaRijec[j]) {
                    pomocniBrojac++;
                }
                if (i+j==razlozenaRecenica.length-1) {
                    break ;
                }
            }
            if (pomocniBrojac == trazenaRijec.length()) {
                brojRijeci++;
            }
        }
        if (brojRijeci == 0) {
            System.out.println("Ta rijec nije u recenici");
        } else {
            System.out.println("Ta rijec se nalazi u recenici broj ponavljanja rijeci je " + brojRijeci);
        }
    }
}
