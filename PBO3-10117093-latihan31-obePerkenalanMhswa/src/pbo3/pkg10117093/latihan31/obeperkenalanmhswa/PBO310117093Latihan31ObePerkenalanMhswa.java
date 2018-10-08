/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan pekenalan 
 * diri dengan menggunakan dua class
 */
package pbo3.pkg10117093.latihan31.obeperkenalanmhswa;

import java.util.Scanner;

/**
 *
 * @author Syahrifal
 */
public class PBO310117093Latihan31ObePerkenalanMhswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner syds = new Scanner(System.in);
        
        Mahasiswa Mhs = new Mahasiswa();
        Mhs.nim = " 10117093";
        Mhs.nama=" Syahrifal dani s"+"\n";
        Mhs.perkenalanDiri(Mhs.nim,Mhs.nama);
        
        Mahasiswa Mhs1 = new Mahasiswa();
        Mhs1.nim = " 10117094";
        Mhs1.nama=" M Awalidin"+"\n";
        Mhs1.perkenalanDiri(Mhs1.nim,Mhs1.nama);
        
        Mahasiswa Mhs2 = new Mahasiswa();
        Mhs2.nim = " 10117092";
        Mhs2.nama=" Dida handiyan"+"\n";
        Mhs2.perkenalanDiri(Mhs2.nim,Mhs2.nama);
                
    }
    
}
