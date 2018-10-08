/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan daftar film 
 * dengan menggunakan dua class
 */
package pbo3.pkg10117093.latihan32.obedaftarfilm;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan32ObedaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Daftar Film Sedang Tayang===");
        
        Film Tyng = new Film();
        Tyng.name  = "Venom";
        Tyng.Genre ="Action, Horro, Scifi";
        Tyng.Rating= 8.5;
        Tyng.Duration= 120;
        Tyng.nowPlaying(Tyng.name,Tyng.Genre,Tyng.Rating,Tyng.Duration );
        
        Film Tyng1 = new Film();
        Tyng1.name  = "Small Foot";
        Tyng1.Genre ="Animation";
        Tyng1.Rating= 9.0;
        Tyng1.Duration= 96;
        Tyng1.nowPlaying(Tyng1.name,Tyng1.Genre,Tyng1.Rating,Tyng1.Duration );
        
        Film Tyng2 = new Film();
        Tyng2.name  = "Small Foot";
        Tyng2.Genre ="Animation";
        Tyng2.Rating= 9.0;
        Tyng2.Duration= 96;
        Tyng2.nowPlaying(Tyng2.name,Tyng2.Genre,Tyng2.Rating,Tyng2.Duration );
        
        Film Tyng3 = new Film();
        Tyng3.name  = "Crazy Rich Asian";
        Tyng3.Genre ="Comdey";
        Tyng3.Rating= 7.8;
        Tyng3.Duration= 119;
        Tyng3.nowPlaying(Tyng3.name,Tyng3.Genre,Tyng3.Rating,Tyng3.Duration );
    
        Film Tyng4 = new Film();
        Tyng4.name  = "Asih";
        Tyng4.Genre ="Horror";
        Tyng4.Rating= 6.0;
        Tyng4.Duration= 100;
        Tyng4.nowPlaying(Tyng4.name,Tyng4.Genre,Tyng4.Rating,Tyng4.Duration );
    }
    
}
