package Zadaca;

//import java.util.Arrays;
import java.util.Scanner;

public class PetljaNiz {
    public static void main(String[] args) {
        int[] nizPogresnih=new int[100];
        int brojac=0;
        do {
            System.out.println("Unesi peticu i zapocni igricu.." );
            nizPogresnih[brojac] = new Scanner(System.in).nextInt();
            brojac++;
            if(nizPogresnih[brojac-1]!=5) {
                for (int i = 0; i < brojac - 1; i++) {
                    System.out.print(nizPogresnih[i] + " ");
                }
            }
            System.out.println("");
        }while (nizPogresnih[brojac-1]!=5);
        System.out.println("super cista petica");
    }
}
