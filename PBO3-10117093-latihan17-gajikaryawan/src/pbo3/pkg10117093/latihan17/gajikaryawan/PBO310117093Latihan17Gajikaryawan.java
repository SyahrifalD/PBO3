/*
 * Nama : Syahrifal dani s
 * Kelas : if - 3
 * NIM  : 10117093
 * Deskripsi: Menampilkan gaji pokok karyawan
 */
package pbo3.pkg10117093.latihan17.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author syahr
 */
public class PBO310117093Latihan17Gajikaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gajiPokok;
        double tunjangan;
        double totalAkhir ;
        String status=null;
         
       
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa Gaji Pokok Anda perbulan ?:Rp. ");
        gajiPokok = scanner.nextDouble();
        System.out.print("Satus Anda(Menikah/Single) ? ");
        status = scanner.next();
        
        
        if("Menikah".equals(status)){
          tunjangan = gajiPokok * 0.35;
        }else tunjangan = 0;
            
        totalAkhir= tunjangan + gajiPokok;
        
        System.out.println("========Hasil Perhitungan Gaji anda======");
        System.out.println("Gaji Pokok\t\t: Rp. "+gajiPokok);
        System.out.println("Tunjangan\t\t: Rp. "+tunjangan);
        System.out.println("Total Gaji\t\t: Rp. "+totalAkhir);
    }
    
}
