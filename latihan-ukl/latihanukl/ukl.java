package latihanukl;

import java.util.Scanner;

public class ukl {
    public static void main(String[] args) {
        // Buat copas
        // System.out.println("");
        // for(int i=0; i<5; i++){}
        String[] namapelanggan = { ("Anni"), ("Bima"), ("Dika"), ("Edo"), ("Rina") };

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nomor Id : ");
        int id = input.nextInt();

        System.out.println("Masukkan Penggunaan Air : ");
        int penggunaan = input.nextInt();

        int totalbayar = 6000; // deklarasi sekalian biaya admin

        System.out.println("===============================");
        System.out.println("Nomor Id = " + id);
        System.out.println("Nama Pelanggan = " + namapelanggan[id - 1]);
        System.out.println("Penggunaan Air = " + penggunaan);

        if (penggunaan <= 10) {
            totalbayar += penggunaan * 3000;
            System.out.println("Total Tagihan = Rp " + totalbayar);
        }

        else if (penggunaan <= 20) {
            totalbayar += 10 * 3000 + (penggunaan - 10) * 4000;
            System.out.println("Total Tagihan = Rp " + totalbayar);
        }

        else if (penggunaan <= 30) {
            totalbayar += 10 * 3000 + 10 * 4000 + (penggunaan - 20) * 5000;
            System.out.println("Total Tagihan = Rp " + totalbayar);
        }

        else if (penggunaan >= 31) {
            totalbayar += 10 * 3000 + 10 * 4000 + 10 * 5000 + (penggunaan - 30) * 6000;
            System.out.println("Total Tagihan = Rp " + totalbayar);
        }

    }
}
