/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan tunjangan 
 * dengan menggunakan dua class
 */
package pbo3.pkg10117093.latihan35.ootunjangan;

import java.util.Scanner;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan35OOtunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sydn = new Scanner(System.in);
        Karyawan kar = new Karyawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = sydn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        kar.status = sydn.next();

        kar.HasilHitung(kar.status,kar.gajiPokok);

    }

    
}
