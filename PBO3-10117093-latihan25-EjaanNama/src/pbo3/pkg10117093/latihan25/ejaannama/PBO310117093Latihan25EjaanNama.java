/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan ejaan nama
 */
package pbo3.pkg10117093.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author syahr
 */
public class PBO310117093Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 String nama;
        
        
        //scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Tampilan output
        System.out.print("Masukkan Nama Depan Kamu Untuk Di Ejaa : ");
        nama = keyboard.next();
        
        int len = nama.length();
        char[] arrChar = new char[len];

        for (int no=0; no< len-1; no++){
        arrChar[no] = nama.charAt(no);
        System.out.println("Huruf ke- "+(no+1)+" : "+ arrChar[no]);
        }
    }
    
}