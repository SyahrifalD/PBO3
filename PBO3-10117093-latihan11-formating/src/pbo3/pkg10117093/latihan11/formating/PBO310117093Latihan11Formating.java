/*
 * Nama     :Syahrifala dani s
 * NIM      :10117093
 * Kelas    :IF - 3
 * Deklarasi:Menampilkan formating huruf R
 */
package pbo3.pkg10117093.latihan11.formating;

/**
 *
 * @author syahr
 */
public class PBO310117093Latihan11Formating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = 3546764;
       int iMinus = -i;
        System.out.println("i :" + i);
        System.out.printf("%%d : %d%n",i);
        System.out.printf("%%10d : %10d%n",i);
        System.out.printf("%%10d : %+10d%n",i);
        System.out.printf("%%10d : %+10d%n",iMinus);
        System.out.printf("%%10d : %,10d%n",i);
        System.out.printf("%%10d : %-10d%n",1);
        double f = 5675482.982;
        System.out.println("f : "+ f);
        System.out.printf("%%f : %f%n", f);
        System.out.printf("%%.2f : %.2f%n",f);
        System.out.printf("%%12.2f : %12.2f%n",f);
        System.out.printf("%%,12.2f : %,12.2f%n",f);
    }
    
}
