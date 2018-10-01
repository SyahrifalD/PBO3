/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan huruf besar
 * menjadi kecil
 */
package pbo3.pkg10117093.latihan27.hurufbesarkecil;


import java.util.Scanner;

/**
 *
 * @author syahr
 */
public class PBO310117093Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        
        
        
        Scanner name = new Scanner(System.in);
        
        System.out.printf("Masukkan Kalimat :");
        kalimat = name.nextLine();
               
        String kalimat1 = kalimat.toUpperCase();
        String kalimat2 = kalimat1.toLowerCase();
                
        System.out.println("====Hasil Formating====");
        System.out.println("Huruf Besar :"+kalimat1 );
        System.out.println("Huruf Kecil :"+kalimat2 );
      
    }
    
}
