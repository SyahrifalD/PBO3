/*
* Nama     :Syahrifala dani s
 * NIM      :10117093
 * Kelas    :IF - 3
 * Deklarasi:Menampilkan tiap tiap variable
 */
package pbo3.pkg10117093.latihan16.penugasan;

/**
 *
 * @author syahr
 */
public class PBO310117093Latihan16Penugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c+"\n");
        
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a = " + c);
        c -= a;
        System.out.println("c -= a = " + c);            
        c *= a;                                        
        System.out.println("c *= a = " + c);            
        a = 10;                                         
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        a = 10;
        c =15 ;
        c %= a;
        System.out.println("c %= a = " + c);
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= a = " + c);
        c &= a;
        System.out.println("c &= 2 = " + c);
        c ^= a;
        System.out.println("c ^= a = " + c);
        c |= a;
        System.out.println("c |= a= " + c);
    }
    
}
