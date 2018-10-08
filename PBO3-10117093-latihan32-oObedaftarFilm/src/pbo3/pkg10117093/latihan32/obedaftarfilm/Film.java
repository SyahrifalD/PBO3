/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117093.latihan32.obedaftarfilm;

/**
 *
 * @author Syahrifal
 */
public class Film {
    public String name;
    public String Genre;
    public double  Rating;
    public int Duration;
    
    public void nowPlaying(String nama,String Genre,double  Rating,int Duration){
      
        
        System.out.println("Judul Film    :"+nama);
        System.out.println("Genre Film    :"+Genre);
        System.out.println("Rating Film   :"+Rating);
        System.out.println("Duration Film :"+Duration+"Menit"+"\n");
    }
    
}
