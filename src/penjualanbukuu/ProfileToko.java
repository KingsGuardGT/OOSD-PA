/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbukuu;

/**
 *
 * @author otnie
 */
public class ProfileToko implements Display{
    String pemilik, tentang;

    public ProfileToko() {
    }

    public ProfileToko(String pemilik, String tentang) {
        this.pemilik = pemilik;
        this.tentang = tentang;
    }

    
    
    public void setProfileToko(String pemilik, String tentang){
        this.pemilik = pemilik;
        this.tentang = tentang;
    }

    public String getpemilik() {
        return pemilik;
    }

    public void setpemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String gettentang() {
        return tentang;
    }

    public void settentang(String tentang) {
        this.tentang = tentang;
    }

    @Override
    public void display() {
        System.out.println("Pemilik Toko :\t\t"+pemilik+"\nTentang Toko :\t"+tentang);
    }    
}
