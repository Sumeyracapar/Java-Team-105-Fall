package ders13_nestedForLoop_methodOlusturma;

public class C03_NestedForLoop {

    public static void main(String[] args) {

        // Soru - 1-4 arasindaki sayilar icin carpim tablosu olusturalim.

       // dıs döngü  satirlari kontrol eder.

        for (int i= 1; i<=4; i++){

            // ic döngü her satirda olan degerleri kontrol eder.

            for (int j=1; j<=4; j++ ) {

                System.out.print(i * j + " ");

            }

                // ic döngü bittiginde javayi alt satira indirmeliyiz.

                System.out.println("");

            }


        }

    }

