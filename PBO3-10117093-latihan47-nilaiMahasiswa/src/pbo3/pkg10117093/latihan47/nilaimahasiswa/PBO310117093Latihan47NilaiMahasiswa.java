/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini menapilkan hasil rata rata nilai mahasiswa
 */
package pbo3.pkg10117093.latihan47.nilaimahasiswa;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Index objI = new Index();
        objI.setQuis(75.0);
        objI.setUts(45.0);
        objI.setUas(34.0);
        System.out.println("QUIZ\t= "+objI.getQuis());
        System.out.println("UTS\t= "+objI.getUts());
        System.out.println("UAS\t= "+objI.getUas());
        System.out.println("");
        System.out.println("Nilai Akhir = "+objI.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
        
        
        Index obj2 = new Index();
        obj2.setQuis(60.0);
        obj2.setUts(80.0);
        obj2.setUas(75.0);
        System.out.println("QUIZ\t= "+obj2.getQuis());
        System.out.println("UTS\t= "+obj2.getUts());
        System.out.println("UAS\t= "+obj2.getUas());
        System.out.println("");
        System.out.println("Nilai Akhir = "+obj2.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
        
        
        Index obj3 = new Index();
        obj3.setQuis(30.0);
        obj3.setUts(80.0);
        obj3.setUas(40.0);
        System.out.println("QUIZ\t= "+obj3.getQuis());
        System.out.println("UTS\t= "+obj3.getUts());
        System.out.println("UAS\t= "+obj3.getUas());
        System.out.println("");
        System.out.println("Nilai Akhir = "+obj3.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");

    }
    
}

