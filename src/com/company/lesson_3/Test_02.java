package com.company.lesson_3;

public class Test_02 {
    public static void main(String[] args) {
        System.out.println(sum(13,32));
        System.out.println(fum(123,13));
        System.out.println(qum(10,2));
        System.out.println(hum(90,2));
    }
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
    public static int fum(int number1, int number2) {
        return number1 - number2;
    }
    public static int qum(int number1, int number2) {
        return number1 * number2;
    }
    public static int hum(int number1, int number2) {
        return number1 / number2;
    }
}
