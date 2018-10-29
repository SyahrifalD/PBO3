/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan merek Hand
 * phone 
 * 
 */
package pbo3.pkg10117093.latihan55.handphone;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.displayProduct();
        android.setKeyStore("234ibfd3840fo");
        System.out.println("Andriod Key Store : " + android.getKeyStore());

        BlackBerry blackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        blackBerry.displayProduct();
        blackBerry.setPinBB("BHS249");
        System.out.println("PIN : " + blackBerry.getPinBB());

        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windowsPhone.displayProduct();
        windowsPhone.setWpKeyStore("UUUQIJWORJ");
        System.out.println("WP Key Store : " + windowsPhone.getWpKeyStore());
    }
    
}
