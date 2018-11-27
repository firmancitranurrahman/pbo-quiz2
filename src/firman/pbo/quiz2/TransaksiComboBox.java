/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firman.pbo.quiz2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ASUS 10.1
 */
public class TransaksiComboBox {
    
    private HashMap<String,Float> item = new HashMap<>();
    
    public TransaksiComboBox() {
        this.item.put("Gula", new Float(30000));
        this.item.put("Kopi", new Float(10000));
        this.item.put("Susu", new Float(20000));
        this.item.put("Rokok", new Float(10000));
    }
    
    public ArrayList<String> getNames() {
        ArrayList<String> struk = new ArrayList<>();
        for(String item : this.item.keySet()) {
            struk.add(item);
        }
        return struk;
    }
    
    public ArrayList<Float> getHarga() {
        ArrayList<Float> harga = new ArrayList<>();
        for(float item : this.item.values()) {
            harga.add(item);
        }
        return harga;
    }
    
    public void tambahItem(String name, float price) {
        this.item.put(name, price);
    }

}
