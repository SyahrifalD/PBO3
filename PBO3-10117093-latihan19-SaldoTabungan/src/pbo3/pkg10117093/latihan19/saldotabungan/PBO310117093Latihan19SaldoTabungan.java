/*
 * Nama : Syahrifal dani s
 * Kelas: IF - 3
 * NIM  : 10117093
 * Deklarasi : Menapilkan saldo dengan pengulangan menggunakan while
 */
package pbo3.pkg10117093.latihan19.saldotabungan;


/**
 *
 * @author syahr
 */
public class PBO310117093Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lama = 0;
        
                       
       while (lama <= 5){
           lama = lama + 1;
           saldoAwal = saldoAwal *bunga + saldoAwal ;
           System.out.println("Saldo Bulan Ke-"+lama + "Rp. " + saldoAwal);
       
       }
       
        
        
    }
    
}
