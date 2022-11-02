package ders17_scope;

public class C01_LocalVariables {

    public static void main(String[] args) {
        //bir method'un icerisinde olusturulan variable'larin scope'u
        // icinde olusturduklari method'dur.
        // o method'un disindan ulasilamazlar

        int sayi=10;
        String isim="Selim";
       // System.out.println(dogruMu);

        for (int i =0; i<10; i++){
            String adres="İstanbul";
           // bir loop icerisinde olusturulan variableler sadece o loop icerisinde gecerlidir.
        }

       // System.out.println(adres);

      double pi;
        // System.out.println(pi);
        // Local variable'lar deger atamadan olusturulabilir ancak kullanilamazlar
        //kullanmadan deger atanmis olmalidir.

    }

   public static void method1(){

        // System.out.println(sayi);
        //  isim="Tugay";

       boolean dogruMu=true;

   }






}







