/*
 * Nama     :Syahrifala dani s
 * NIM      :10117093
 * Kelas    :IF - 3
 * Deklarasi:Menampilkan jumlah kambing setelah ditambah
 */
package lathan05.kambingGlobal;

/**
 *
 * @author syahr
 */
public class kambingGlobal {
   // Variabel jumlahkambing menjadi variabel kambing
    int jumlahkambing = 88;
  // Method untuk menapilkan jumlah kambing
    public void getjumlahkambing() {
        System.out.println("Jumlah kambing :"+jumlahkambing);
    }

    public void tambahkambing() {
        jumlahkambing = jumlahkambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " +jumlahkambing);
        
    }
    public static void main(String[] args) {
        kambingGlobal kambingSusu = new kambingGlobal();
        
        // Menapilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getjumlahkambing();
        
        // Menambah satu kambing
        kambingSusu.tambahkambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getjumlahkambing();
    }
}
