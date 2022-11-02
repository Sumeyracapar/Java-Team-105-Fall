package ders26_passByValue_immutableClasses;

import java.util.Locale;

public class C07_ImmutableString {
    public static void main(String[] args) {

        String str="Java Candir";

        str=str.toUpperCase();

        System.out.println(str); // JAVA CAND

        /*
          Immutable class'lardan olusturulan bir objenin degeri DEGİSTİRİLEMEZZ!
          Eger atama yaparsak java degerini degistirmez bunun yerine yeni bir obje olusturur.
          ve bu yeni objeye yeni atadiginiz degeri atar.

          eski obje bosa cıkar ve garbege collector tarafindan silinmeyi bekler
         */
    }
}
