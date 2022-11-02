package ders13_nestedForLoop_methodOlusturma;

public class C02_StringTersineCevirme {

    public static void main(String[] args) {

        // soru 10  (interview) -Kullanicidan bir string alin ve String'i tersine cevirip kaydedin.

        String input= "Java her gecen gün güzellesiyor";
        String tersİnput =" ";

        for (int i = input.length()-1; i>=0; i--){
            tersİnput += input.substring(i, i+1);


        }
        System.out.println("Ters hali :" +tersİnput);


    }
}
