/*
 * Nama     :Syahrifala dani s
 * NIM      :10117093
 * Kelas    :IF - 3
 * Deklarasi:Menampilkan nilai dari keyword
 */
package pbo3.pkg10117093.latihan03.menpilkannilaikeyword;

import java.util.Scanner;

/**
 *
 * @author syahr
 */
public class PBO310117093Latihan03Menpilkannilaikeyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Masukan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}

