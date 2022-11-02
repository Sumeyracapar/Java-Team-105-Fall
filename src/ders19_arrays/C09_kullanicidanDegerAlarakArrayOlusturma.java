package ders19_arrays;

import java.util.Scanner;

public class C09_kullanicidanDegerAlarakArrayOlusturma {

    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alip bir array olusturun
        //kullanici eleman girisini bitirmek icin Q'a basin


        Scanner scan= new Scanner(System.in);
        int[] arr= {0};
        int girilensayi=0;

        do {

            System.out.println("array'e eklemek icin bir  tam sayi giriniz" +
                    "\nBitirmek icin 0'a basin");
            girilensayi= scan.nextInt();

            if (arr[0]==0){
                arr[0]=girilensayi;

            } else if (girilensayi!=0) {
                arr=C08_ArrayeElemanEklemeMethodu.arrayeElemanEkle(arr,girilensayi);

            }


        } while (girilensayi!=0);





    }
}
