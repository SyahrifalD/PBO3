/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan Rabbit
 *
 */
package pbo3.pkg10117093.latihan53.rabbit;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit1 = new Rabbit("Peter",false, "grass", 4, "grey" );
        System.out.println("Hello, His name is "+rabbit1.getName());
        System.out.println(rabbit1.getName()+" is Vegetarian? "+rabbit1.isVegetarian());
        System.out.println(rabbit1.getName()+" eats "+rabbit1.getEats());
        System.out.println(rabbit1.getName()+" has "+rabbit1.getNoOfLegs()+" legs.");
        System.out.println(rabbit1.getName()+" color is "+rabbit1.getColor());

    }
    
}
