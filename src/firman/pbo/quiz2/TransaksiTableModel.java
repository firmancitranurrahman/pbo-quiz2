/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firman.pbo.quiz2;
import javax.swing.table.TableModel;
/**
 *
 * @author ASUS 10.1
 */
public class TransaksiTableModel {
     private String[] kolom; // kolom digunakan untuk tempat menyimpan nama
    
    // Constructor
    public TransaksiTableModel() {
        this.kolom = new String[] {
            "Nama", "Harga", "Jumlah"
        };
    }
    
    // kolom getter
    public String[] getColumnName() {
        return this.kolom;
    }

}

   