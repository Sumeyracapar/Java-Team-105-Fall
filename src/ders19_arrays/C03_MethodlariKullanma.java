package ders19_arrays;

import ders18_arrays.C03_ArrayElementleriniArtirma;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {

    public static void main(String[] args) {

        // verilen bir int array'in elementlerini 2 artirip bize dönduren bir method olusturun
        //Eski array'i yeni haliyle kaydedin


        int[] arr={2,3,4};
       // arr= C03_ArrayElementleriniArtirma.elementleri2artir(arr);
        System.out.println(Arrays.toString(arr)); // [4,5,6 ]

        // arr array'inde 10 element olarak var mi ?
        C05_ArraydeElemanArama.elemanAra(arr,10); // Aranan sayi array'de yok

        // kullanicidan deger olarak bir array olusturun
          int[] yeniArr= C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));
    }


}
