/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini menapilkan hasil voulme dan jenis kubus
 * 
 */
package pbo3.pkg10117093.latihan41.masajenis;

import java.util.Scanner;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan41MasaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner syds = new Scanner(System.in);
        Kubus kub = new Kubus();
        
        System.out.println("=====MASSA JENIS KUBUS=====");
        System.out.print("Sisi : ");
        kub.setSisi(syds.nextInt());
        System.out.print("Massa: ");
        kub.setMasa(syds.nextInt());
        
        System.out.println("\n"+"=====HASIL PERHITUNGAN=====");
        System.out.println("Volume      : "+kub.hitungVolume(kub.getSisi()));
        System.out.println("Massa Jenis : "+kub.hitungMasaJenis(kub.getMasa(),
                kub.hitungVolume(kub.getSisi())));
    }
     
    
}
