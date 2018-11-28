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

    
    public Transaksi(String kode, ArrayList<Item> items) {
        this.kode = kode;
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    //setter total 
    public void setTotal() {
        for(Item item:this.items){
            total=0;  
            total += item.getTotal();
        }
        this.total = total;
    }
    public String strukDetail() { 
        setTotal();
        String struk = "";
        struk += "Kode\t\t: "+ this.kode +"\n";
        struk += "Daftar Belanja : \n";
        for(Item item : this.items) {
            struk += "\t"+ item.getNamaBarang() +"(x"+ item.getSatuan() +") : "+ item.getTotal() +"\n";
        }
        struk += "Total\t\t: "+ this.total;
        return struk;
    }
}
