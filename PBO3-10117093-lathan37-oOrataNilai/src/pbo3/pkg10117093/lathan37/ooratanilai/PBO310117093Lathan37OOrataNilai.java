/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan Rata nilai 
 * Mhs dengan menggunakan dua class
 */
package pbo3.pkg10117093.lathan37.ooratanilai;

import java.util.Scanner;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Lathan37OOrataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Mahasiswa mah = new Mahasiswa();
         Scanner sydn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = sydn.nextInt();

         mah.HitungTotal(mah.nilaiMhs, n);
         mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "+mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs,n));
        System.out.println("Developed by : Muhammad Walidin");

    }
    
}
