/*
 * Nama     :Syahrifala dani s
 * NIM      :10117093
 * Kelas    :IF - 3
 * Deklarasi:Menampilkan jumlah kambing 
 */
package latihan04.kambing;

/**
 *
 * @author syahr
 */
public class kambing {

    public void tambahkambing() {
        int jumlahkambing = 0 ;
        
        jumlahkambing = jumlahkambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : "+jumlahkambing);
        
    }
    public static void main(String[] args) {
        kambing kambingJantan = new kambing();
        kambingJantan.tambahkambing();
    }
}
