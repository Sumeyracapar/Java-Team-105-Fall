package ders15_overloding_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        /*
          Kullanicidan toplanmak üzere tamsayilar alin
          Kullanici 0' a basarsa sayi alma islemini bitirin

          kullanicinin kac sayi girdigini
          ve bu sayilarin toplaminin kac oldugunu yazdirin

         */

        Scanner scan = new Scanner(System.in);

        int girilensayi=5; // verilen ilk deger bu soru icin 0 olmamali
                          // cünkü 0 loop'u bitirmek icin kullanacak

        int sayac=0;
        int toplam=0;

        while (girilensayi !=0){
            System.out.println("Lütfen toplamak icin tamsayi girin" +"\nBitirmek icin 0'a basin");

            girilensayi= scan.nextInt();

            if (girilensayi != 0){
                sayac++;
                toplam=toplam+girilensayi;


            }


        }

        System.out.println("Girilen " + sayac + " adet sayinin toplami : "+ toplam);

    }
}
