/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firman.pbo.quiz2;
import java.util.*;
/**
 *
 * @author ASUS 10.1
 */
public class Transaksi {
    private final String kode; // atribut untuk menndeklarasikan kode
    private ArrayList<Item> items = new ArrayList<>(); // Atribut item di konvert menjadi arraylist 
    private float total; // atribut yang digunakan untuk menaruh hasil perhitungan

    
      public Transaksi (String kode , ArrayList<Item> items) {
        this.kode = kode ;
        this.items = items ;
        
    }

 
    //setter total 
     public void setTotal () {
        float total = 0 ;
        for (Item item : this.items) {
            total += item.getTotal() ;
        }
        this.total = total ;
    }
    public String Pembayaran() {
        setTotal () ;
        String obt = "" ;
        obt += "Kode\t\t : " + this.kode +"\n" ;
        obt += "Daftar Belanja : \n" ;
        for (Item item : this.items) {
            obt += "\t" + item.getNamaBarang()+ "(x" + item.getJumlah() + ") : " + item.getTotal() + "\n" ;
        }
        obt += "Total\t\t : " + this.total ;
        return obt ;
    }
}
