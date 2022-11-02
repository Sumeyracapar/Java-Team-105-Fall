package ders19_arrays;

import java.util.Arrays;

public class C06_ArrayeyeniDegerAtama {

    public static void main(String[] args) {

        String str="java";

        str="hava";


        /*
          var olan bir array'in uzunlugu degistirilemez
          AMA
          var olan bir array'e yeni bir array degeri atanabilir.
         */

        // 1- var olan bir array'i yeni bir deger olarak atayabiliriz


        String [] arr1={"Ali", "Veli"};
        String [] arry2={"A", "B", "C"};

        arr1=arry2;

        System.out.println(Arrays.toString(arr1)); // [ A, B, C]

        // 2- istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz

        arr1=new String[6];
        System.out.println(Arrays.toString(arr1));//  [null, null, null, null, null, null]

        // 3- yeni olusturulan bir array'e { } icinde deger yazarak atama yapabiliriz.
//    ancak var olan bir array'e yeni deger atamasi icin { } KULLANILAMAZ

        // arr1={"g","h"}; olmaz

        int[] arr = {3,4,5};
    }
}
