package latihanukl;

import java.util.Scanner;

public class ukl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] namapelanggan = { ("Galuh"), ("Indro"), ("Jedi"), ("Kanu") };
        String[] alamatpelanggan = { ("Sawojajar"), ("Kedung Kandang"), ("Ijen"), ("Dinoyo") };
        int[] golongan = { 1, 3, 2, 3 };

        int harga1 = 1000;
        int harga2 = 1300;
        int harga3 = 1500;
        int total = 0;

        System.out.println("Masukkad Id Pelanggan : ");
        int id = input.nextInt();

        System.out.println("Masukkan Banyak Pemakaian : ");
        int pemakaian = input.nextInt();

        int penghitungan = golongan[id - 1];
        switch (penghitungan) {
            case 1:
                total = pemakaian * harga1 + 13000;
                break;
            case 2:
                total = pemakaian * harga2 + 13000;
                break;
            case 3:
                total = pemakaian * harga3 + 13000;
                break;
        }

        if (total < 50000) {
            total = 50000;
        }

        System.out.println("=====================");
        System.out.println("Id = " + id);
        System.out.println("Nama = " + namapelanggan[id - 1]);
        System.out.println("Golongan = " + golongan[id - 1]);
        System.out.println("Alamat = " + alamatpelanggan[id - 1]);
        System.out.println("---------------------");
        System.out.println("Jumlah Penggunaan = " + pemakaian + " kwh");
        System.out.println("Total Harus Bayar = Rp " + total);

    }
}
