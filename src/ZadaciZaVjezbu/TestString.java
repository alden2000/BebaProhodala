package ZadaciZaVjezbu;

import java.util.Scanner;

public class TestString {

    public int upisGolova(){
        int dati, primljeni;
        dati=new Scanner(System.in).nextInt();
        primljeni=new Scanner(System.in).nextInt();
        return dati - primljeni;
    }
}
