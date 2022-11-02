package ders22_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C03_ArrayAsList {

    public static void main(String[] args) {

        Integer []arr={1,2,3};

        // verilen bir array'ı list'e cevirmek icin
        //bir list olusturup for loop ile elementleri tasimayi tavsiye ediyoruz

       List<Integer> arraydenList= Arrays.asList(arr);
        System.out.println(arraydenList); // [1,2,3]

        //Bu yontemin 2negatif yonu vardir;
        //1- bu sekilde olusturulan Listler esnkle uzunluga sahip degillerdir.
        // add, remove gibi ozellikleri kullanmak isterseniz RunTimeException olusur

        //arraydenList.add(10); // UnsupportedOperastionException
        //arraydenList.add(1); // UnsuppertedOperationException

        //2-bu yontem kaynak olan array ile yeni olusturulan List'i birbirine baglar
        // birinde yaptıgınız degisikligi, otomatik olarak digerine de yansitir

        System.out.println();

    }
}
