package ZadaciZaVjezbu;

import java.util.Scanner;

public class TestStringDemo {
    public static void main(String[] args) {
        TestString goRazlika=new TestString();
        String[] fudbalskiKlubovi=new String[4];
        for (int i=0; i<fudbalskiKlubovi.length; i++){
            fudbalskiKlubovi[i]= new Scanner(System.in).nextLine();
        }
        for (String s : fudbalskiKlubovi) {
            System.out.println(s);
            System.out.println(goRazlika.upisGolova());
        }
        }
    }

