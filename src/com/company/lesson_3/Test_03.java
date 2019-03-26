package com.company.lesson_3;
/*
1) Создать метод convert, который должен конвертировать гривны в доллары. В метод должен приходить один аргумент (к-во гривен). Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/
public class Test_03 {
    public static void main(String[] args) {
        System.out.println(convert(4000.0));
        System.out.println(percent(50.0));
        print("Khv");
    }

    public static double convert(double grn) {
        return  grn/26;


    }

    public static double percent(double number) {
        return number*0.1+number;


    }
    public static void print(String k) {
        System.out.println(k);
        System.out.println(k);
        System.out.println(k);
        System.out.println(k);
    }
}
