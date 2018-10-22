/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117093.latihan41.masajenis;

/**
 *
 * @author Syahrifal
 */
public class Kubus {
    private int sisi;
    private int masa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int Sisi) {
        this.sisi = Sisi;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int Masa) {
        this.masa = Masa;
    }

 
     public int hitungVolume(int parSisi ){
        return parSisi * parSisi * parSisi;
         
    }
    public int hitungMasaJenis(int parMasa,int volume ){
        return parMasa / volume;
        
    }
  
}
