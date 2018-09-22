/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan05.kambinggelobal;

/**
 *
 * @author syahr
 */
public class kambingStatic {
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING ="MIDUN";
    
    public static void main(String[] args) {
        mamalia.jumlahkambing = 48500;
        System.out.println(NAMA_KAMBING+" memiliki kambing sebanyak :"+mamalia.
                jumlahkambing);
    }
}
