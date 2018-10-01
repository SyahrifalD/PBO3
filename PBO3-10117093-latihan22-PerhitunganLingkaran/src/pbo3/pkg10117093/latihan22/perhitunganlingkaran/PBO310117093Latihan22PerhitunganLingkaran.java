/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * hasil perhitungan lingkaran
 */
package pbo3.pkg10117093.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author syahr
 */
public class PBO310117093Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double jari;
        double keliling;
        double luas;
        String n;
        double phi = 3.15;
        boolean ulang = true;
                
        
        Scanner scanner = new Scanner(System.in);
        
        while(ulang==true){
        
        System.out.println("=======Perhitungan Lingkaran========");
        System.out.print("Masukan Nilai Diameter Lingkaran : ");
        n = scanner.next();
        
        if(n.matches("[0-9]*")){
        double akhir =Double.parseDouble(n);
        
            jari = akhir / 2;
            luas = phi*(Math.pow(jari,2));
            keliling = 2 * phi * jari;
        
        
        System.out.println("=======Hasil Perhitungan Lingkaran========");
        System.out.println("Jari - Jari Lingkaran = " +jari+ "cm");
        System.out.println("Luas Lingkaran        =" +luas+"cm");
        System.out.println("Keliling Lingkaran    =" +keliling+ "cm");
        ulang = false;
        
        
        }else
        
            System.out.println("Nilai Diameter Tidak Sesuai");
        }
    }
    
}
