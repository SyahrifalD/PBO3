/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan Terbesar 
 * dan terkecil dengan menggunakan dua class
 */
package pbo3.pkg10117093.latihan39.oonilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan39OOnilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Mahasiswa mhs1 = new Mahasiswa();
        Scanner keyboard = new Scanner(System.in);
        
        int bykMah;
        String nama;
        System.out.println
        ("========Program Nilai Terbesar dan Terkecil nilai Mahasiswa========");
        System.out.print("Masukkan Nama Petugas : ");
        nama = keyboard.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        bykMah = keyboard.nextInt();
        mhs1.inputNilai(mhs1.nilai, bykMah);
        mhs1.tampilBesarKecil(mhs1.nilai, bykMah);
        
        System.out.println("\n"+"Petugas : " + nama);

        
    }
    
}
