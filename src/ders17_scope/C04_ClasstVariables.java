package ders17_scope;

public class C04_ClasstVariables {
    public static void main(String[] args) {

        // C03 deki hastane ismini yazdirmak istesek
        System.out.println(C03_ObjectVariables.hastaneİsmi); // yildiz hastanesi
        System.out.println(C03_ObjectVariables.hastaSayisi); // 23453

        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();

        System.out.println(C03_ObjectVariables.hastaSayisi); // 23456

    }  // kod takibi main methodda basla
       // main methodun sonuna gelindiginde hersey biter
       // tum degisimler resetlenir
       // variable degerleri bastaki hallerine döner

     public  static void method1(){
        C03_ObjectVariables.hastaSayisi++;
     }

}