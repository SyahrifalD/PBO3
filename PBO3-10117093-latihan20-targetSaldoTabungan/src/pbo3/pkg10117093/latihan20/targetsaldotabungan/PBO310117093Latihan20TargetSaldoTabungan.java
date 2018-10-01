/*
 * Nama : Syahrifal dani s
 * Kelas: IF - 3
 * NIM  : 10117093
 * Deklarasi : Menapilkan saldo dengan pengulangan menggunakan while dengan 
 *target
 */
package pbo3.pkg10117093.latihan20.targetsaldotabungan;

/**
 *
 * @author syahr
 */
public class PBO310117093Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double SaldoAwal = 3500000 ;
        double Bunga = 0.08;
        double target = 6000000;
        int i = 1;
        
        do{   
            
        SaldoAwal = (SaldoAwal * Bunga) + SaldoAwal;  
        System.out.println("Saldo di bulan ke-"+i + " Rp."+SaldoAwal);
        i++; 
        } while(SaldoAwal <= target );
       
    
    }
    
}
