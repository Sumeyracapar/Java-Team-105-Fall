package ders26_passByValue_immutableClasses;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class C06_ImmutableClasses {

    public static void main(String[] args) {

        String str="Java güzeldir";
        System.out.println(str.toLowerCase()); // JAVA GUZELDİR

        System.out.println(str); // Java guzeldir
        str.toLowerCase();

        System.out.println(str); // Java guzeldir


        //String ımmutable oldugu icin method ile yapilan degisiklikler string'i kalıcı  degistirmez


        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("B");

        harfler.remove(0);

        System.out.println(harfler);

        //list ve Array mutable olduklari icin method ile yapilan degisiklikler kalici olur.
    }
}
