/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan GajiKaryawa
 * 
 */

package pbo3.pkg10117093.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Karyawan kar = new Karyawan();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK \t: ");
        kar.setNik(scn1.next());
        System.out.print("Masukkan Nama \t: ");
        kar.setNama(scn2.nextLine());
        System.out.print("Masukkan Golongan (1/2/3/) : ");
        kar.setGolongan(scn1.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        kar.setJabatan(scn1.next());
        System.out.print("Masukkan Jumlah Kehadiran \t: ");
        kar.setJmlKehadiaran(scn1.nextInt());

        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK \t\t: "+kar.getNik());
        System.out.println("Nama \t\t: "+kar.getNama());
        System.out.println("Golongan \t: "+kar.getGolongan());
        System.out.println("Jabatan \t: "+kar.getJabatan());

        System.out.println("\nTUNJANGAN GOLONGAN \t\t: "+kar.tunjnnganGolongan());
        System.out.println("TUNJANGAN JABATAN \t\t: "+kar.tunjanganJbatan());
        System.out.println("TUNJANGAN KEHADIRAN \t: "+kar.tunjanganKehadiran());

        System.out.println("\nGAJI TOTAL : "+kar.totalGaji());
    }
    
}