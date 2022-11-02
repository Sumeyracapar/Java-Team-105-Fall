package ders17_scope;

public class C02_ClassLevelVariables {

    //class level variablelar method'ların disinda olusturulur
    // genel kullanim en üstte olusturulmalaridir
    static String hastaneİsmi="Yildiz hastanesi";
    static int hastaSayisi=23453;
    static String basHekimIsmi;  // bunlar statik olmak zorundadir
    String persIsmi= "Isim girilmesi";
    String persTelefon="Telefon girilmesi";
    int persYasi;

    public static void main(String[] args) {
        System.out.println(hastaneİsmi); // yildiz hastanesi
        System.out.println(basHekimIsmi); // null
         //System.out.println(persIsmi);static olmadigi icin main methoddan kullanilamaz

        /*
         class level variabler'a deger atamasi yapilmamissa
         java bu variable'lara data türüne göre default olarak tanimlanan
         degerleri atar default degerler
         sayisal variable'lar:0
         blooen : false
         char : ' '
         objeler (string dahil) : null
         */
    }

    public  static void  method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
         // System.out.println(persIsmi);

    }

    public void method2(){
        System.out.println(hastaneİsmi);

    }


}



