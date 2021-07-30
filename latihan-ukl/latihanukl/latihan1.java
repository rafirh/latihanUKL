package latihanukl;

public class latihan1 {

    public static void main(String[] args) {
        System.out.println("===== Latihan Soal 1 =====");
        System.out.println();

        int n, x, y, Un, Sn;
        n = 10; // jumlah perulangan
        x = 3; // suku pertama
        y = 5; // selisih 2 suku berurutan
        Un = 0;
        Sn = 0;
        for (int i = 1; i <= n; i++) { // perulangan

            Un = x;
            x += y; // menghitung nilai suku ke-n
            System.out.println("Nilai suku ke-" + i + " adalah = " + Un); // menampilkan nilai suku ke-n

            Sn += Un;

            System.out.println("===========================");
            System.out.println();
            System.out.println("Jumlah deret aritmatika yang terdiri dari " + n + " suku adalah " + Sn);
        }

        System.out.println();
        System.out.println("===========================");
        System.out.println();
        System.out.println("Jumlah deret aritmatika yang terdiri dari " + n + " suku adalah " + Sn);
        System.out.println();

    }

}