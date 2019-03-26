package com.company.HM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
 Если число отрицательное, то прибавить единицу. Вывести результат на экран. */
public class DZ_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffred = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String st = buffred.readLine();
        int numb = Integer.parseInt(st);

        if (numb>0) {
            System.out.println(numb * 2);
        } else if (numb<0) {
            System.out.println(numb+1);
        }else
            System.out.println("Ваше число 0");

    }
}


