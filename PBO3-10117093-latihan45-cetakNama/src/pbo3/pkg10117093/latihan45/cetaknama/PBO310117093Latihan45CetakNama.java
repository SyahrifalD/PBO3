/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini menapilkan cetak nama
 */
package pbo3.pkg10117093.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner syds = new Scanner(System.in);
        Printer print = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        print.setNama(syds.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        print.setJmlCetak(syds.nextInt());
        
        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
    }
    
}
