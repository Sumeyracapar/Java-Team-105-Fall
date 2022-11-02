package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

    // main method icerisinde kullanicidan iki sayi alin
    // bu iki sayiyi parametre olarak kabul edip carpimlarini bize döndüren bir method olusturun

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayi yazdirin");
        double sayi1 = scan.nextDouble(); // 5
        double sayi2 = scan.nextDouble();  // 3
        System.out.println(carpimMethodu(sayi1,sayi2)); // 15.0

         double carpimMethodu= carpimMethodu(6,2); // 12.0

    }

    public  static double carpimMethodu(double sayi1, double sayi2){

        System.out.println("carpi methodu calisti");
        return sayi1*sayi2;




    }



    }


