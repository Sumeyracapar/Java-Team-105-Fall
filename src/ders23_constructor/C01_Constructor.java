package ders23_constructor;

import java.util.Scanner;

public class C01_Constructor {
    public static void main(String[] args) {

        // Scanner class'indaki method ve variable'lari(özellikleri) kullanmak icin scan objesi olustururz.
           Scanner    scan             =          new                             Scanner(System.in);

        // class adi obje ismi  obje olusturmak icin keyword         Scanner Constructor'i
        scan.nextInt();
        String str = new String("Java Candir");
        String str2= "Java ne guzel";
        str.toLowerCase();
    }
    public static void C01_constructor(){
        // method isimleri kucuk harfle baslar
        // class ismi ile ayni isimde olmamasi tercih edilir
        // return type var bu method'dur, constructor olamaz
    }
}





