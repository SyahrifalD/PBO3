/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan cakap yoi 
 * Enggka
 */
package pbo3.pkg10117093.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author syahr
 */
public class PBO310117093Latihan30Cakep {

  //    kode text color
    public static final String SYDNS_RESET = "\u001B[0m";
    public static final String SYDNS_BLACK = "\u001B[30m";
    public static final String SYDNS_RED = "\u001B[31m";
    public static final String SYDNS_GREEN = "\u001B[32m";
    public static final String SYDNS_YELLOW = "\u001B[33m";
    public static final String SYDNS_BLUE = "\u001B[34m";
    public static final String SYDNS_PURPLE = "\u001B[35m";
    public static final String SYDNS_CYAN = "\u001B[36m";
    public static final String SYDNS_WHITE = "\u001B[37m";
//    kode background color
    public static final String SYDNS_BLACK_BACKGROUND = "\u001B[40m";
    public static final String SYDNS_RED_BACKGROUND = "\u001B[41m";
    public static final String SYDNS_GREEN_BACKGROUND = "\u001B[42m";
    public static final String SYDNS_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String SYDNS_BLUE_BACKGROUND = "\u001B[44m";
    public static final String SYDNS_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String SYDNS_CYAN_BACKGROUND = "\u001B[46m";
    public static final String SYDNS_WHITE_BACKGROUND = "\u001B[47m";
    
//    Method Utama
    public static void main(String[] args) {
        String jawab;
        Scanner scn = new Scanner(System.in);
        
        System.out.print(SYDNS_RED+"Kamu "+SYDNS_RESET);
        System.out.print(SYDNS_GREEN+"ngerjain sendiri "+SYDNS_RESET);
        System.out.print(SYDNS_YELLOW+"latihan 17 sampe "+SYDNS_RESET);
        System.out.print(SYDNS_BLUE+"latihan 30 ini? \n"+SYDNS_RESET);
        System.out.print(SYDNS_BLUE+"Jawab "+SYDNS_RESET);
        System.out.print(SYDNS_RED+"(Yoi/Enggak) : "+SYDNS_RESET);
        jawab = scn.next();
        
        String jawaban = jawab.toUpperCase();
        if (jawaban.equals("YOI")) {
            System.out.print(SYDNS_RED+"\nCakep Bener. "+SYDNS_RESET);
            System.out.print(SYDNS_PURPLE+"Good Job \n"+SYDNS_RESET);
        }else{
            System.out.print(SYDNS_RED+"\nTetep cakep sih. "+SYDNS_RESET);
            System.out.print(SYDNS_CYAN+"\nSing penting paham konsep nya yee. "
                    +SYDNS_RESET);
            System.out.print(SYDNS_BLACK+"\nKeep the code works dude."+SYDNS_RESET);  
        }
    }
    
}
