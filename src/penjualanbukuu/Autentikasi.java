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
public class Autentikasi implements Akses{
    private String username;
    private String password;

    public String getUsername() {
        return this.username;
    }

    
    public String getPassword() {
        return this.password;
    }
    
    @Override
    public void loginAdmin() {
        Scanner scan = new Scanner(System.in);
        Autentikasi autentikasi = new Autentikasi();
        System.out.println("================================");
        System.out.print("Username: ");
        username = scan.nextLine();
        System.out.println("================================");
        System.out.print("Password: ");
        password = scan.nextLine();
        System.out.println("================================");

        if("Penjual".equals(username) && "belidong".equals(password)){
            System.out.println("Selamat Datang Admin");
        }else{
            System.out.println("Username & Password yang anda masukkan Salah");
            autentikasi.loginAdmin();
        }
    }

    @Override
    public void loginPembeli() {
        Scanner scan = new Scanner(System.in);
        Autentikasi autentikasi = new Autentikasi();
        System.out.println("================================");
        System.out.print("Username: ");
        username = scan.nextLine();
        System.out.println("================================");
        System.out.print("Password: ");
        password = scan.nextLine();
        System.out.println("================================");

        if("Pembeli".equals(username) && "belidong".equals(password)){
            System.out.println("Berhasil");
        }else{
            System.out.println("Username & Password yang anda masukkan Salah");
            autentikasi.loginPembeli();
        }
    }   
}

