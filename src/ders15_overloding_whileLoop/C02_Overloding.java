package ders15_overloding_whileLoop;

public class C02_Overloding {

    public static void main(String[] args) {
        carpim(3,5); // method call sirasinda method parantezine yazilanlara argüment denir
        carpim(3.4,2); // double - integer iki sayinin carpimi:6.8
    }

    // Bir class'da ayni isim ve ayni signature'a sahip iki method olmaz.
    /*
      Method overloding oşlan class'larda java hangi methodun calisacagina s
      su sekilde karar verir

        1-Önce method ismine bakar
        2-Argüment sayisi ile parametre sayisine bakar
        3-Argüment ve parametre uyumuna bakar
        4-minumum casting
     */

    public static void carpim(int sayi1, int sayi2){  // carpim int int

        System.out.println(" iki integer sayinin carpimi " +sayi1*sayi2);

    }
    public static void carpim(int sayi3, int sayi4, int sayi5){
        System.out.println("Uc integer sayinin carpimi" + sayi3*sayi4*sayi5);
    }
     public static void carpim(double sayi1, int sayi2){
         System.out.println("double - integer iki sayinin carpimi:"+ sayi1*sayi2);
     }
      public static void carpim(int sayi1, double sayi2){
          System.out.println("integer - double iki sayinin carpimi:"+ sayi1*sayi2);
      }





}

