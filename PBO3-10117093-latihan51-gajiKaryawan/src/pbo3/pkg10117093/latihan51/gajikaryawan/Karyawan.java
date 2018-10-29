/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117093.latihan51.gajikaryawan;

/**
 *
 * @author Syahrifal
 */
public class Karyawan {
    private String nik;
    private String nama;
    private int golongan;
    private String jabatan;
    private int jmlKehadiaran;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getJmlKehadiaran() {
        return jmlKehadiaran;
    }

    public void setJmlKehadiaran(int jmlKehadiaran) {
        this.jmlKehadiaran = jmlKehadiaran;
    }
    public double tunjnnganGolongan(){
        double besarTunjangn = 0;
        switch(golongan){
            case 1 : besarTunjangn=500000; break;
            case 2 : besarTunjangn=1000000; break;
            case 3 : besarTunjangn=15000000; break;
            
        }
        return besarTunjangn;
    }
    public  double tunjanganJbatan(){
        double besarTunjangan= 0;
        switch(jabatan){
            case"Manager":besarTunjangan=2000000; break;
            case"Kabag":besarTunjangan=1000000; break;
        }
        return besarTunjangan;
    }
    public  double tunjanganKehadiran(){
        return jmlKehadiaran*10000;
    }
    public double totalGaji(){
        return tunjanganJbatan()+tunjanganJbatan()+tunjanganKehadiran();
    }
}
