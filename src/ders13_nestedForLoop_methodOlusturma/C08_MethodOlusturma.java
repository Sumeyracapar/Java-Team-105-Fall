package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {

    public static void main(String[] args) {

        /*
          Kullanicidan 2 sayi alıp, bunlarin toplamini yazdiran bir method olusturun
         */

        isteToplaYazdir();
    }

    public static void isteToplaYazdir() {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen iki sayi yazdirin");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println(sayi1+sayi2);
    }

}

