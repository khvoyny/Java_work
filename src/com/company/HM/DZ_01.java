package com.company.HM;
//Реализовать метод closeToTen.
//Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в
// аргументах метода.Например, среди чисел 8 и 11 ближайшее к десяти 11.
//Если оба числа на равной длине к 10, то вывести на экран любое из них.
public class DZ_01 {
    public static void main(String[] args)
    {
        closeToTen(7,15);
        closeToTen(18,9);
    }

    public static void closeToTen(int a, int b)
    {
        int c= 10-a;
        int d=10-b;
        if (abs(c)<abs(d))
            System.out.println(a);
        if (abs(c)>abs(d))
            System.out.println(b);
        if (abs(c)==abs(d))
            System.out.println(a);
    }

    public static int abs(int a)
    {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}

