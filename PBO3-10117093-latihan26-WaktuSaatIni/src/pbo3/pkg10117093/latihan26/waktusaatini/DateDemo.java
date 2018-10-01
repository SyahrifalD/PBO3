/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan waktu hari 
 * ini
 */
package pbo3.pkg10117093.latihan26.waktusaatini;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author syahr
 */
public class DateDemo {
  
    public static void main(String[] args) {
        
    
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd  hh:mm:ss a zzz");

      System.out.println("Hari ini Adalah Hari: " + ft.format(dNow));
   
    }
 } 

