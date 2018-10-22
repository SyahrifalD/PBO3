/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini menapilkan hasil voulme dan jenis kubus
 */
package pbo3.pkg10117093.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner syds = new Scanner (System.in);
        
        System.out.println("=======Program Penarikan Uang=======");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(syds.nextInt());
        System.out.print("Jumlah uang yang diambil : ");        
        System.out.print("Saldo anda Sekarang : " 
                + tabungan.ambilUang(syds.nextInt())+ "\n");
        
    }
    
}