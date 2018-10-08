/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan kalkulator 
 * dengan menggunakan dua class
 */
package pbo3.pkg10117093.latihan34.oosistemkalkuator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan34OOSistemKalkuator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sydn = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kal.value1 = sydn.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kal.value2 = sydn.nextDouble();

        //format dua digit di belakang koma
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : "+kal.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kal.kurangBiangan());
        System.out.println("Hasil Perkalian : "+kal.kaliBilangan());
        System.out.println("Hasil Pembagian : "+df.format(kal.bagiBilangan()));
        System.out.println("Hasil Sisa : "+kal.sisaBilangan());

    }

    private static void nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}