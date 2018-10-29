/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini Menapilkan Siapa kamu menggunakan extend 
 * 
 */
package pbo3.pkg10117093.latihan52.siapakamu;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10117093");
        mahasiswa.setNama("Syahrifal Dani");
        mahasiswa.setUmur(22);
        mahasiswa.setKelas("PBO3");

        System.out.println("\nNIP MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}