/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini menapilkan hasil umur
 */
package pbo3.pkg10117093.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Age age = new Age(2018);

        Scanner syds = new Scanner(System.in);
        System.out.print("Masukkan Tahun lahir anda : ");
        age.setYearBirth(syds.nextInt());
        
        System.out.println("======Hasil Perhiyungan Umur======");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth(0));
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + age.hitungUmur()+ " tahun");
        System.out.println("Tandanya Kamu : "+ age.tandanyaKamu(age.hitungUmur()));
    }
    
}
