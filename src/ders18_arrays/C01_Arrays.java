package ders18_arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6, 8, 10};

        // array'in bir elementine ulasmak ve update etmek istersek;

        System.out.println(arr1[2]); // 6

        arr1[3] = 20;

        System.out.println(arr1[3]); // 20

        System.out.println(arr1.length);// 5

        // son elementi yazdirin
        System.out.println(arr1[arr1.length - 1]); // 10

        // arry'in tüm elementlerini yazdirin

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

        // array'in uzunlugu sonradan degistirilemez
        // eger array'de olmayan bir index'e atama yapmak isterseniz
        // ArrayIndexOutOfBoundsException
        // Run time error'dur

       //arr1[5] = 35;

    }




     }




