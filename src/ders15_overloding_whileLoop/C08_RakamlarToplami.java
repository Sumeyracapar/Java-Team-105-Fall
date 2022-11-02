package ders15_overloding_whileLoop;

public class C08_RakamlarToplami {

    public static void main(String[] args) {

        // Soru 2- While Loop kullanarak kullanicidan alinana rakamlar toplamini bulun.

        int sayi= 14531111;

        int birlerBasamagi=0;
        int rakamalarToplami=0;

        while (sayi !=0){
            birlerBasamagi=sayi%10;
            rakamalarToplami +=birlerBasamagi;
            sayi /= 10;

            System.out.println(rakamalarToplami);


        }

    }
}
