/*
* NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini menapilkan perbandingan nilai 
 * 
 */
package pbo3.pkg10117093.latihan24.perbandingannilai;

import java.util.Scanner;

/**
 *
 * @author syahr
 */
public class PBO310117093Latihan24PerbandinganNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        deklarasi variabel
        int n1;
        int n2;
        String lagi; //variabel pengontrol aktifitas
        Scanner scn = new Scanner(System.in);
        
        System.out.println("========Program Perbandingan Nilai========");
//        menggunakan looping do while
        do {            
            System.out.print("Masukkan nilai pertama : ");
            n1 = scn.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            n2 = scn.nextInt();
            
//            rumus perbandingan
            if (n1 > n2) {
                System.out.println("Hasil : "+n1+" Lebih besar dari "+n2+"\n");
            }else if(n1 < n2){
                System.out.println("Hasil : "+n1+" Lebih kecil dari "+n2+"\n");
            }else
                System.out.println("Hasil : "+n1+" sama dengan "+n2+"\n");
                
//            ketikkan "Tidak" bila ingin berhenti aktifitas
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            lagi = scn.next();
            
            System.out.println("");//memberi jarak satu baris
        } while (!lagi.equals("Tidak"));
    }
    
}