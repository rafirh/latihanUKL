package latihanukl;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 5;
        System.out.println("Masukkan tinggi segitiga : ");
        a = input.nextInt();

        for (int i = 0; i <= a; i++) {
            System.out.println();
            for (int b = 0; b < i; b++) {
                System.out.print("*");
            }
        }

        System.out.println("\n");
        System.out.println("================================");

        for (int i = 0; i <= a; i++) {
            System.out.println();
            for (int b = i; b < a; b++) {
                System.out.print("*");
            }
        }

    }
}
