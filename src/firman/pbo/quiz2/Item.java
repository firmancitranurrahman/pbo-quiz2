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
   private String namaBarang; //nama barang 
   private float harga; // harga barang 
   private int satuan; // satuan barang
   public Item(String namaBarang, int satuan){
       this.namaBarang=namaBarang;
       this.satuan=satuan;
   }
    public Item(String namaBarang, float harga,int satuan) {
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.satuan = satuan;
    }

    //getter namaBarang
    public String getNamaBarang() {
        return namaBarang;
    }
    //setter namaBarang
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

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public int getSatuan() {
        return satuan;
    }

    public void setSatuan(int satuan) {
        this.satuan = satuan;
    }  
    public float getTotal(){
        return this.harga * this.satuan;
    }
}
  
