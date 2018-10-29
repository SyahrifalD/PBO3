/*
  * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan perhitungan 
 * Bangun Ruang
 */
package pbo3.pkg10117093.latihan61.bangunruang;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Bola b = new Bola();
        Tabung t = new Tabung();
        Kerucut k = new Kerucut();
        
        b.setR(7);
        System.out.println("Volume Bola : " + Math.ceil(b.hitungVolume()));
        
        t.setH(21);
        t.setR(10);
        System.out.println("Volume Tabung : " + Math.ceil(t.hitungVolume()));
        
        k.setR(14);
        k.setH(9);
        System.out.println("Volume Kerucut : " + Math.ceil(k.hitungVolume()));
    }
    
}
