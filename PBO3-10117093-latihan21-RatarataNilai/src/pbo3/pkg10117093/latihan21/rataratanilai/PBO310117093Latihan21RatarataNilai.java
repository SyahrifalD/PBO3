/*
  Nama : Syahrifal dani s
 * Kelas: IF - 3
 * NIM  : 10117093
 * Deklarasi : Menghitung niali rata - rata mahasiswa              
 */
package pbo3.pkg10117093.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author syahr
 */
public class PBO310117093Latihan21RatarataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int n,jml,nilai[];
        float rata,jumlah=0;
        
        System.out.print("Masukkan Banyak Mahasiswa : ");
        n = input.nextInt();
        
        nilai = new int[n];
        
        for(int i=0; i <= n - 1; i++){
            System.out.print("Nilai Mahasiswa Ke-"+(i+1)+ ":");
            nilai[i] = input.nextInt();
            System.out.println();
        }
        
        for(int j=0; j<= n-1; j++){
            jumlah =jumlah + nilai[j];
        }
        rata = jumlah/n;
        
        System.out.println("Maka, Rata -Rata Nilainya Adalah :"+rata);
    }
    
}
