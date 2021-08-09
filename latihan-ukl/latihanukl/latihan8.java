package latihanukl;

import java.util.Scanner;

public class latihan8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] namapelanggan = { (""), ("Ali"), ("Budi"), ("Dani"), ("Edi"), ("Umar") };

        System.out.println("Masukkan Id = ");
        int id = input.nextInt();

        System.out.println("Masukkan Jumlah Pemakaian : ");
        int jumlahpemakaian = input.nextInt();
        int tagihan;

        System.out.println("===============================");

        System.out.println("Nomor Id = " + id);
        System.out.println("Nama Pelanggan = " + namapelanggan[id]);

        if (jumlahpemakaian <= 10) {
            tagihan = 2000;
            System.out.println("Total Tagihan = Rp " + tagihan);
        } else if (jumlahpemakaian <= 20) {
            tagihan = 2000 + 3000;
            System.out.println("Total Tagihan = Rp " + tagihan);
        } else if (jumlahpemakaian <= 30) {
            tagihan = 2000 + 3000 + 4000;
            System.out.println("Total Tagihan = Rp " + tagihan);
        } else if (jumlahpemakaian >= 31) {
            tagihan = 2000 + 3000 + 4000 + 5000;
            System.out.println("Total Tagihan = Rp " + tagihan);
        }

    }

}
