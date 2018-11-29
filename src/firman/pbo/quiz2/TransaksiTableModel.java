/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firman.pbo.quiz2;
import javax.swing.table.*;
;
/**
 *
 * @author ASUS 10.1
 */
public class TransaksiTableModel extends DefaultTableModel{
     private String[] kolom; // kolom digunakan untuk tempat menyimpan nama
    
    // Constructor
    public TransaksiTableModel() {
        this.kolom = new String[]{       
            "Nama" , "Harga" , "Jumlah"
        };
    }
    
    // kolom getter
    public String[] getNamaKolom() {
        return this.kolom;
    }

    @Override
    public void setRowCount(int rowCount) {
        super.setRowCount(rowCount); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addRow(Object[] os) {
        super.addRow(os); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeRow(int i) {
       super.removeRow(i); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

   