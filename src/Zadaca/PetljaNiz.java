package Zadaca;

import java.util.Arrays;
import java.util.Scanner;

public class PetljaNiz {
    public static void main(String[] args) {
        int[] nizPogresnih=new int[1];
        int broj;
        int n=0;
        while (true){
            System.out.println("Unesi broj: ");
            broj = new Scanner(System.in).nextInt();
            if(broj==5){
                System.out.println("Poceo si igricu.");
                break;
            }else {
                nizPogresnih[n]=broj;
                nizPogresnih = Arrays.copyOfRange(nizPogresnih, 0,nizPogresnih.length+1);
//                nizPogresnih[n]=broj;
                n++;
                //nizPogresnih = Arrays.copyOfRange(nizPogresnih, 0,nizPogresnih.length);
                String poruka = "Unio si ";
                for (int i=0; i<nizPogresnih.length-1; i++) {
                    poruka= poruka + nizPogresnih[i] + " ";
                }
                System.out.println(poruka+ "brojeve");
            }
        }
    }
}
