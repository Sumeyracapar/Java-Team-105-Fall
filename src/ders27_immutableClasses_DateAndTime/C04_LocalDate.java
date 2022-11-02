package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.util.Locale;

public class C04_LocalDate {

    public static void main(String[] args){

        LocalDate  tarih=  LocalDate.now();

        System.out.println(tarih); // 22-10-29

        System.out.println(tarih.minusDays(100)); // 2022-07-21
        System.out.println(tarih.minusWeeks(5).minusDays(3)); //2022-09-21

        System.out.println(tarih.plusMonths(5));
        System.out.println(tarih.plusWeeks(2));
        System.out.println(tarih.plusDays(3));

        System.out.println(tarih.getMonthValue()); //10
        System.out.println(tarih.getMonth());  // october
        System.out.println(tarih.getDayOfWeek()); // saturday
        System.out.println(tarih.getDayOfYear());  //302

        System.out.println(tarih.isLeapYear()); // false

        System.out.println(tarih.withYear(2000).isLeapYear());
        System.out.println(tarih.withYear(2000).withMonth(11).withDayOfMonth(13));

        System.out.println(tarih.lengthOfYear());

        System.out.println(tarih.withYear(2020).lengthOfYear());

        System.out.println(tarih.withYear(1985).withMonth(8).withDayOfMonth(11));

    }


}
