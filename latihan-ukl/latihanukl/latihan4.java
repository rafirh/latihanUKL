package latihanukl;

public class latihan4 {
    public static void main(String[] args) {

        System.out.println("Latihan 4A");
        System.out.println("=============");

        int sukupertama = 5;
        int selisih = 5;
        int tinggisegitiga = 4;
        int nilaisuku;

        for (int i = 0; i <= tinggisegitiga; i++) {

            for (int b = 0; b < i; b++) {
                nilaisuku = sukupertama;
                sukupertama += selisih;
                System.out.print(nilaisuku + " ");
            }
            System.out.println();
        }

        System.out.println("\n-----------------------\n");
        System.out.println("Latihan 4B");
        System.out.println("============\n");

        int sukupertama2 = 5;
        int selisih2 = 5;
        int tinggisegitiga2 = 5;
        int nilaisuku2;

        for (int i = 0; i <= tinggisegitiga2; i++) {

            for (int b = i; b < tinggisegitiga2; b++) {
                nilaisuku2 = sukupertama2;
                sukupertama2 += selisih2;
                System.out.print(nilaisuku2 + " ");
            }
            System.out.println();
        }

    }
}
