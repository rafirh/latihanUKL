package latihanukl;

public class latihan5 {

    public static void main(String[] args) {

        int[][] nil1 = { { -5, 3 }, { 7, 2 } };
        int[][] nil2 = { { 3, 1 }, { 5, -2 } };
        int[][] hasil = new int[2][2];

        int jumlahbaris = nil1.length;
        int jumlahkolom = nil2.length;

        // Menampilkan matriks A
        System.out.println("Matrik A");

        for (int i = 0; i < jumlahbaris; i++) {
            for (int j = 0; j < jumlahkolom; j++) {
                System.out.print(nil1[i][j] + "  ");
            }
            System.out.println();
        }

        // Menampilkan matriks B
        System.out.println("Matrik B");

        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.print(nil2[k][l] + "  ");
            }
            System.out.println();
        }

        // Proses perhitungan
        for (int x = 0; x < jumlahbaris; x++) {
            for (int y = 0; y < jumlahkolom; y++) {
                hasil[x][y] = nil1[x][y] - nil2[x][y];
            }
        }

        // Menampilkan hasil
        System.out.println("Hasil Pengurangan Matriks A Dan B =");

        for (int x = 0; x < jumlahbaris; x++) {
            for (int y = 0; y < jumlahkolom; y++) {
                System.out.print(hasil[x][y] + "  ");
            }
            System.out.println();
        }

    }

}
