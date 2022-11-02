package ders15_overloding_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {

    /*
     Kullanicidan toplanmak üzere sayi alin
     sayilarin toplami 500'e esit veya gecerse

     girilen sayi adedi,
     girilen sayilarin toplamini ve
     "Bu kadar yeter" yazdirin
      */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double girilensayi=0;
        double toplam=0;

        while (toplam<500){
            System.out.print("Toplanmak icin sayi girin");
            girilensayi=scan.nextDouble();


          toplam+=girilensayi;




    }



}








}
