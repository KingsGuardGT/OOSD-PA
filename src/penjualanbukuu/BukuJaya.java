/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbukuu;

import java.util.Scanner;

/**
 *
 * @author otnie
 */
public class BukuJaya implements Display {
    String namaToko, pemilikToko, lokasi, tahunBerdiri, karyawanToko, totalCustomer;
//    String totalCustomer = "1000";

    public BukuJaya() {
    }
    
    public BukuJaya(String namaToko, String pemilikToko, String lokasi, String karyawanToko, String tahunBerdiri, String totalCustomer) {
     this.namaToko = namaToko;
        this.pemilikToko = pemilikToko;
        this.lokasi = lokasi;
        this.tahunBerdiri = karyawanToko;
        this.karyawanToko = tahunBerdiri;
        this.totalCustomer = totalCustomer;
    }
    public void setToko(String namaToko, String pemilikToko, String lokasi, String karyawanToko, String tahunBerdiri, String totalCustomer) {
        this.namaToko = namaToko;
        this.pemilikToko = pemilikToko;
        this.lokasi = lokasi;
        this.karyawanToko = karyawanToko;
        this.tahunBerdiri = tahunBerdiri;
        this.totalCustomer = totalCustomer;
        
    }
    //Profil Toko
    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getPemilikToko() {
        return pemilikToko;
    }

    public void setPemilik(String pemilikToko) {
        this.pemilikToko = pemilikToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getKaryawanToko() {
        return karyawanToko;
    }

    public void setKaryawanToko(String karyawanToko) {
        this.karyawanToko = karyawanToko;
    }

    public String getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(String tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }
    
    public void setTotalCustomer(String totalCustomer){
        this.totalCustomer = totalCustomer;
    }    
    public String getTotalCustomer(){
        return totalCustomer;
    }
    

    


    @Override
    public void display() {
        System.out.println("Nama Toko : "+ getNamaToko() + "\nLokasi : " + getLokasi() + "\nPemilik Toko : " + getPemilikToko() + "\nKaryawan Toko : " + getKaryawanToko() + "\nTahun Berdirinya Toko : " + getTahunBerdiri() + "\nJumlah Customer Toko Jaya : " + getTotalCustomer());
    }
    
    public void editProfil(){
        System.out.println("\t======== Edit Profil Toko Buku Jaya =======");
        Scanner scan =  new Scanner(System.in);
        System.out.print("Nama Toko : ");
        namaToko = scan.next();
        System.out.print("Nama Pemilik Toko : ");
        pemilikToko = scan.next();
        System.out.print("Lokasi Toko Buku Jaya : ");
        lokasi = scan.next();
        System.out.print("Tahun Berdiri Toko Jaya: ");
        tahunBerdiri = scan.next();
        System.out.print("Karyawan Toko Jaya : ");
        karyawanToko = scan.next();
        System.out.print("Total Customer Toko Jaya: ");
        totalCustomer = scan.next();
        System.out.print("Total Customer Toko Jaya: ");
        totalCustomer = scan.next();
    }
}
