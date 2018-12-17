/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.SyahrifalDaniS.Latihanmvc.model;

import edu.SyahrifalDaniS.Latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Syahrifal
 */
public class PelangganModel {
    private String nama;
    private String email;
    private String tlfn;
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getTlfn() {
        return tlfn;
    }

    public void setTlfn(String tlfn) {
        this.tlfn = tlfn;
        fireOnChange();
    }
    protected void fireOnChange(){
        if(pelangganListener!= null){
           pelangganListener.OnChange(this);
        }
       
    }
    
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setTlfn("");
    }
    public void simpanForm(){
        JOptionPane.showMessageDialog(null,"BERHASIL DISIMPAN");
    }
}