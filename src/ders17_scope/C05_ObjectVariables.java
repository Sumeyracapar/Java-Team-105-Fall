package ders17_scope;

import java.util.Scanner;

public class C05_ObjectVariables {

    public static void main(String[] args) {

         // C03 class'indaki instance variable'lara nasil ulasabiliriz?
        // instance variable'larin diger adi obje variable'laridir
        // instance variable'lara obje uzerinden ulasabiliriz.

       C03_ObjectVariables pers1= new C03_ObjectVariables();

        System.out.println(pers1.persIsmi); // isim girilmedi
        System.out.println(pers1.persYasi); // 0

        pers1.persIsmi="Aysegül";
        pers1.persYasi=35;
        pers1.persTelefon="555.3566884";

        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);

        C03_ObjectVariables pers2= new C03_ObjectVariables();
        



    }
}
