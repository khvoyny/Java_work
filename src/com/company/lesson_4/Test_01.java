package com.company.lesson_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Реализовать метод checkInterval.
//Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить
// результат на экран в следующем виде: "Число а не содержится в интервале." или
// "Число а содержится в интервале.", где а - аргумент метода.
public class Test_01 {
    public static void main(String[] args) throws IOException {
       int a = input();
       checkInterval(a);
    }

    public static int input() throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String str = buff.readLine();
        return Integer.parseInt(str);
    }


    public static void checkInterval(int a) {
        if (a > 100 || a < 50)
            System.out.println("Число " + a + " не содержится в интервале.");
        else
            System.out.println("Число " + a + " содержится в интервале.");
    }

    }