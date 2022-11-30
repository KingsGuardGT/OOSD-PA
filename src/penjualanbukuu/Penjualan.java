/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbukuu;

import java.util.ArrayList;
/**
 *
 * @author otnie
 */
public class Penjualan {
    
    String nama_buku;
    int stok;
    int harga;
    
    
    ArrayList<Penjualan> penjualan = new ArrayList();

    public Penjualan(String nama, int stok, int harga) {
        this.nama_buku = nama_buku;
        this.stok = stok;
        this.harga = harga;
    }

    public Penjualan() {
    }
    
public void tampilPenjualan(){
        System.out.println("No" +"\tNamaBuku" + "\tStokBuku"+"\tHargaBuku");
        for(int i=0;i<penjualan.size();i++){
            System.out.println(i+1+". "
                    +"\t"+ penjualan.get(i).nama_buku
                    +"\t"+ penjualan.get(i).stok
                    +"\t"+ penjualan.get(i).harga
                    
            );
        }
    }
    
    public void addPenjualan(String nama_buku,int stok, int harga){
        penjualan.add(new Penjualan(nama_buku, stok, harga));
    }
    
    public void deletePenjualan(int opsi){
        for(int i=0;i<penjualan.size();i++){
            if(opsi==i){
                penjualan.remove(i);
            }
        }
    }
    
    public void updatePenjualan(String nama_buku,int stok, int harga, int opsi){
        penjualan.set(opsi, new Penjualan(nama_buku, stok, harga));
    }
    
}
    