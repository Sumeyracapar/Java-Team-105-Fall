package ders17_scope;

public class C03_ObjectVariables {

    static String hastaneİsmi="Yildiz hastanesi";
    static int hastaSayisi=23453;
    static String basHekimIsmi;  // bunlar statik olmak zorundadir
    String persIsmi= "Isim girilmesi";
    String persTelefon="Telefon girilmesi";
    int persYasi;

    /*
     Class level variable'larin scope'u tum class'dir.
     static kelimesi ile isaretlenen variable'lara
     class icerisinde heryerden ulasabildigi icin diger adi class variable 'dir.

     static kelimesi ile isaretlenmeyen variable'lara ise instance variable denir.
     instance variable'lar objelere bagli olduklarından bu variablelarin diger adi object variables'dir.

     */

    public static void main(String[] args) {

    }




}
