/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firman.pbo.quiz2;

/**
 *
 * @author ASUS 10.1
 */
public class Item {
   private String namaBarang;
   private double harga;
   private String satuan;
   
    public Item(String namaBarang, double harga, String satuan) {
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.satuan = satuan;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    @Override
    public String toString() {
        return this.namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }    
}
