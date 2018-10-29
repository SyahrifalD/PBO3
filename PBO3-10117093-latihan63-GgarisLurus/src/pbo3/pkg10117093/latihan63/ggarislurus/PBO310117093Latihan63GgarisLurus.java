/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan perhitungan 
 * kooridnat
 */
package pbo3.pkg10117093.latihan63.ggarislurus;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan63GgarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik ("+koordinat1.getX1()+","
                +koordinat1.getY1()+") dan ("+koordinat1.getX2()+","
                +koordinat1.getY2()+")");
        System.out.println("memiliki gradien sebesar "
                +koordinat1.hitungGradien());
        
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+koordinat2.getX1()+","
                +koordinat2.getY1()+") dan ("+koordinat2.getX2()+","
                +koordinat2.getY2()+")");
        System.out.println("memiliki gradien sebesar "
                +koordinat2.hitungGradien());

    }
    
}
