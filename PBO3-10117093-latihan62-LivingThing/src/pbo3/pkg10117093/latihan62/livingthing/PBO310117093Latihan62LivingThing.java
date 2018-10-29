/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan  
 * LivingThing
 */
package pbo3.pkg10117093.latihan62.livingthing;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Human human = new Human();
        human.setNama("Syahrifal Dani");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
        
    }
    
}
