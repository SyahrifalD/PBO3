/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini menapilkan hasil Gaji Karyawan
 */
package pbo3.pkg10117093.latihan43.gajipegawai;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("------------------------------------");
        GajiPegawai karyawan1 = new GajiPegawai();
        karyawan1.setNama("SYAHRIFAL DANI S");
        karyawan1.setAlamat("Sarua indah banten");
        karyawan1.setUangTransport(250000);
        karyawan1.setUangTunjangan(300000);
        karyawan1.setGajiPokok(4500000);
        karyawan1.setTotalGaji(karyawan1.totalGaji(karyawan1.getUangTunjangan()
                ,karyawan1.getUangTransport(),karyawan1.getGajiPokok()));
        karyawan1.tampilData(karyawan1.getNama(),karyawan1.getAlamat(),
                karyawan1.getUangTunjangan(),karyawan1.getUangTransport()
                ,karyawan1.getGajiPokok(),karyawan1.getTotalGaji());
    }
    
}
