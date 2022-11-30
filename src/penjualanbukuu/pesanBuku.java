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
public class pesanBuku {
    
    int jumlah_buku;
    String nama_buku;
    long no_hp;
    String alamat;
    String pesanKhusus;
    
    ArrayList<pesanBuku> pesanBuku = new ArrayList();

    public pesanBuku() {
        
    }

    public pesanBuku(int jumlah_buku, String nama_buku, long no_hp) {
        this.jumlah_buku = jumlah_buku;
        this.nama_buku = nama_buku;
        this.no_hp = no_hp;
    }

    public pesanBuku(int jumlah_buku, String nama_buku, long no_hp, String alamat) {
        this.jumlah_buku = jumlah_buku;
        this.nama_buku = nama_buku;
        this.no_hp = no_hp;
        this.alamat = alamat;
    }

    public pesanBuku(int jumlah_buku, String nama_buku, long no_hp, String alamat, String pesanKhusus) {
        this.jumlah_buku = jumlah_buku;
        this.nama_buku = nama_buku;
        this.no_hp = no_hp;
        this.alamat = alamat;
        this.pesanKhusus = pesanKhusus;
    }
    
    public void show(){
        System.out.println("No"+"\t\tNama Buku"+"\t\tNomor HandPhone Anda"+"\t\tJumlah Buku yang di belu"+"\t\tMasukkan Alamat Anda"+"\t\tPesan Khusus untuk Buku Anda :");
        for(int i = 0;i<pesanBuku.size();i++){
            System.out.println(i+1+"\t\t"+pesanBuku.get(i).nama_buku+"\t\t"+pesanBuku.get(i).no_hp+"\t\t"+pesanBuku.get(i).jumlah_buku+"\t\t"+pesanBuku.get(i).alamat+"\t\t"+pesanBuku.get(i).pesanKhusus);
        }
    }
    public void pesanBuku2(int jumlah_kamar, String nama, long no_ktp,String lokasi,String status){
        pesanBuku.add(new pesanBuku(jumlah_kamar, nama, no_ktp,lokasi, status));
    }
    
    public void updateBuku2(int ops,int jumlah_buku, String nama_buku,String alamat, long no_hp,String pesanKhusus){
        for(int i = 0;i<pesanBuku.size();i++){
             if(ops == i){
                 pesanBuku.set(i,new pesanBuku(jumlah_buku, nama_buku, no_hp, alamat, pesanKhusus));
             }
         }
    }
    
    public void hapusPemesanan(int opsi){
        for(int i =0;i<pesanBuku.size();i++){
            if(opsi == i){
                pesanBuku.remove(i);
            }
        }
    }
}
