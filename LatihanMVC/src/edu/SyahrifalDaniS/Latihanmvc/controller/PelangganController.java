/*
 * NAMA : SYAHRIFAL DANI S
 * KELAS : IF3
 * NIM   : 10117093
 */
package edu.SyahrifalDaniS.Latihanmvc.controller;

import edu.SyahrifalDaniS.Latihanmvc.model.PelangganModel;
import edu.SyahrifalDaniS.Latihanmvc.view.PelanganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Syahrifal
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelanganView view){
        String nama = view.getTxtnama().getText();
        String email = view.getTxtemail().getText();
        String tlfn = view.getTxttlfn().getText();
        if (nama.equals("") && (email.equals("") && (tlfn.equals("")))) {
            
        } else {
            model.resetForm();
        }
    }
    public  void simpanForm(PelanganView view){
        String nama = view.getTxtnama().getText();
        String email = view.getTxtemail().getText();
        String tlfn = view.getTxttlfn().getText();
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view,"Nama Masih Kosong");
        } else {if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view,"Email Masih Kosong");
        }else {if (tlfn.trim().equals("")) {
            JOptionPane.showMessageDialog(view,"No Tlfn Masih Kosong");
        }else{
            model.simpanForm();
        }
        }
        }
    }
}
