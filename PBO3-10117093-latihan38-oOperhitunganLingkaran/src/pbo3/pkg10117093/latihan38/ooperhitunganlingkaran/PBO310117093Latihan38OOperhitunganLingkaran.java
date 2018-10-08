/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan Perhitungan 
 * Lingkaran dengan menggunakan dua class
 */
package pbo3.pkg10117093.latihan38.ooperhitunganlingkaran;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan38OOperhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
    
}
