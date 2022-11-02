package ders22_arrayLists;

import jdk.dynalink.linker.LinkerServices;

import java.awt.*;
import java.util.ArrayList;

public class C05_ForeachLoop {

    public static void main(String[] args) {

        // Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        // - Kelimenin uzunlugu cift sayi ise ilk yarisini
        // - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //  yeni bir listeye ekleyip yazdirin.


        String[] arr = {"Sumeyra", "Selim", "Mehmet", "Ekrem", "Hafsa"};
        // List<String> yeniList = new. ArrayList<>();

        for (String each : arr) {

            if (each.length() % 2 == 0) { // uzunlıgı cft


            }
        }
    }
}
