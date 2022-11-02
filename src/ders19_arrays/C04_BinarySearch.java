package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {

    public static void main(String[] args) {


        int [] arr = {1,8,9,3,7,2,5,8,1};

        System.out.println(Arrays.binarySearch(arr,8)); // 7.index
        System.out.println(Arrays.binarySearch(arr,5)); // -2.index
        System.out.println(Arrays.binarySearch(arr,1)); // 0.index
        System.out.println(Arrays.binarySearch(arr,9)); // -10.index

        /*
         Binary search method'unun dogru sonuclar verebilmesi icin
         öncelikle sort method'u kullanilmalidir.

         sort() kullanmadan binarysearch() ile yapilan aramanin sonucu
         dogru sonuc da verebilir , yanlıs sonuc da..
         */

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 1, 2, 3, 5, 7, 8, 8, 9]



        System.out.println(Arrays.binarySearch(arr, 8)); // 6
        System.out.println(Arrays.binarySearch(arr, 5)); // 5
        System.out.println(Arrays.binarySearch(arr, 1)); // 1
        System.out.println(Arrays.binarySearch(arr, 9)); // 8

        // array' de olmyan bir leman aratirsak;
        // java önce o sayi array'de olsa nerede olurdu onu arar
        // sonra buldugu bu SIRA'yi - isareti ile verir (-3 gibi)

        System.out.println(Arrays.binarySearch(arr,-3)); // -1 (-3 burda olsaydı  -0. indexte olurdu -0 olmadıgı icin)
        System.out.println(Arrays.binarySearch(arr,4)); // -5
        System.out.println(Arrays.binarySearch(arr,10)); // -10
        System.out.println(Arrays.binarySearch(arr,100)); // -10 (9dan büyük kac yazarsak yazalim -10verir)


    }
}




