package latihanukl;

public class latihan3 {
    public static void main(String[] args) {

        System.out.println("MATRIKS 2x3");
        int sukupertama = 10;
        int selisih = 5;
        int nilaisuku;
        int baris = 3;
        int totalnilai = 0;

        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 5; i++) {

                nilaisuku = sukupertama;
                sukupertama += selisih;

                System.out.print(" " + nilaisuku);

                totalnilai += nilaisuku;
            }
            System.out.println();
        }

        System.out.println("Total nilai = " + totalnilai);

    }

}
