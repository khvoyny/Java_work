package com.company.lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число");

        String at = buf.readLine();
        int number = Integer.parseInt(at);

        System.out.println("Я буду зарабатывать $" + number + "час");
    }
}