package ders23_constructor;

public class DAraba {

    // Bir proje olusturulurken tum classlarda main method olmasina gerek yoktur
    // cogu class obje olusturularak kullanilmak uzere hazirlanmis depolardir
    // Biz de bu class'i araba objeleri icin depo olarak dizayn edelim


    // Her class olusturuldugunda java o class'dAN OBJE olusturabilmesi
    //  icin default bir constructor olusturur
    // Bu default constructor gorunmez
    // default constructor prametresizdir ve bize standart bir


    String marka ="Marka belirtilmedi";
    String model= "Model belirtilmedi" ;
    String yakit;
    int yil;
    int fiyat;
    
    
    public  int maxHiz(String yakit) {
        int maxHiz=120;

        if (yakit.equalsIgnoreCase("dizel")) {
            maxHiz = 200;

        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz = 230;

        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz = 180;
        }
        return maxHiz;

    }
}
