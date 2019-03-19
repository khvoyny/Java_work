package com.company.lesson_01;

// public protected default private

public class Test_01 {
    public static int count = 10000000; // []
    public int age = 20; // 4byte[] [] [] [] []

    public static void main(String[] args) {
        int i = 3545; // 4 byte = 32 bit = 2^32 // Integer
        byte b = 127; // 1 byte = 8 bit = 2^8   // Byte
        char c = 'g'; // 2 byte = 16 bit = 2^16 // Character
        boolean bool = true; // 4 byte          // Boolean
        short s = 32000; // 2 byte = 16 bit     // Short
        double d = 32.4; // 8 byte              // Double
        float f = 35.4f; // 4 byte              // Float
        long l = 346254735435l; // 8 byte       // Long

        Integer number = 10;

        String str2 = "50";
        int num = Integer.parseInt(str2);

        System.out.println(num * 2);
        System.out.print(num * 2);

        String str = "hrgnjkberg 2342738 bfreg2iu^%&*$%^%^";

    }
}
