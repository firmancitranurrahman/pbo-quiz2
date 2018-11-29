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
   private int jumlah; // satuan barang
   public Item(String namaBarang, int jumlah){
       this.namaBarang=namaBarang;
       this.jumlah=jumlah;
   }
    public Item(String namaBarang, float harga,int jumlah) {
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.jumlah=jumlah;
       switch(this.namaBarang){
           case "Kopi":this.harga=10000;
           break;
           case "Gula":this.harga=10000;
           break;
           case "Susu":this.harga=10000;
           break;
       }
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

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }  
    public float getTotal(){
        return this.harga * this.jumlah;
    }
}
  
