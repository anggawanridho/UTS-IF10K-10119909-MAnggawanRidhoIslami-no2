package uts_pbo;

import java.util.Scanner;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10K10119909UTSno2 {

    public static void main(String[] args) {
        int saldo, jumlah;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Program Penarikan Uang=====");
        System.out.print("Masukkan Saldo Awal\t\t\t: ");
        saldo = scanner.nextInt();
        System.out.print("Jumlah uang yang diambil\t: ");
        jumlah = scanner.nextInt();
        Tabungan tabung = new Tabungan(saldo);
        System.out.println("Saldo Anda Sekarang\t\t\t: "+tabung.ambilUang(jumlah));
    }
}
