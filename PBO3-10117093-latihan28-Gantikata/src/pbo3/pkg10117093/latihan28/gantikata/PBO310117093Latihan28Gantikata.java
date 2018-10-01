/*
*  NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan ganti kata
 * 
 */
package pbo3.pkg10117093.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author syahr
 */
public class PBO310117093Latihan28Gantikata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        deklarasi Variabel
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String jadiKata;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("====Program Ganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scn.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scn.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scn.next();
        
        //proses pergantian kata dengan kata yang lain
        kalimatBaru =  (kalimatAwal).replaceAll(gantiKata, jadiKata);
        
        //menampilkan hasil perubahan kata
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat Awal : "+kalimatAwal);
        System.out.println("Kalimat Baru : "+kalimatBaru);
        
        
        
        
    }
    
}
 