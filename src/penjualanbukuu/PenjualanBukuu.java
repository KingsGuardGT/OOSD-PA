/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penjualanbukuu;

import java.util.Scanner;

/**
 *
 * @author otnie
 */
static String namaToko, lokasi, kades, wakades, sekdes, berdes, isi, biaya;
    static String pemilik, tentang;
    public static void main(String[] args) {

        PotensiDesa desa = new PenjulanaBuku();
        Autentikasi auten = new Autentikasi();
        Homestay home = new Homestay();
        Penjualan penjualan = new Penjualan();
        Pemesanan pesan = new Pemesanan();
        Komentar komen = new Komentar();
        Scanner scan = new Scanner(System.in);
        Komentar.shows show= komen.new shows();

        //Profil Desa
        Desa profil = new Desa();
        Desa Desa[] = new Desa[100];
        for (int i = 0; i < Desa.length; i++) {
            Desa[i] = new Desa(namaDesa, lokasi, kades, wakades, sekdes, berdes);
        }
        Desa[0].setDesa("Desa Bahagia", "Medan", "Hosea Felix Hutahuruk", "Juan Siallagan", "Melysa", "Christine");

        //Peraturan Desa
        PeraturanDesa peraturan = new PeraturanDesa();
        PeraturanDesa PeraturanDesa[] = new PeraturanDesa[100];
        for (int i = 0; i < PeraturanDesa.length; i++) {
            PeraturanDesa[i] = new PeraturanDesa(judul, Isi, hukuman);
        }

        PeraturanDesa[0].setPeraturanDesa("Mencuri", "Berat.", "Penjara");
        PeraturanDesa[1].setPeraturanDesa("Berzinah", "Berat.", "Penjara");
        PeraturanDesa[2].setPeraturanDesa("Membunuh", "Berat.", "Penjara");
        PeraturanDesa[3].setPeraturanDesa("Pencemaran Nama Baik", "Sedang.", "Sanski sosial");

        //Event
        Event event = new Event();
        event.addEvent("Futsal", "10/12/2019", "AFF");
        event.addEvent("Inovasi", "05/10/2019", "Desa");

        ////        event.deleteEvent(0);
//        event.updateEvent(1,"wwww", "kades", "namaDesa");
//        event.tampilEvent();
        //Laporan keuangan
        LaporanKeuangan laporan = new LaporanKeuangan();
        laporan.addLaporan("Cat", "12/12/2019", "120.000");
        laporan.addLaporan("Printer", "10/12/2019", "500.0000");

        //Surat Permohonan
        SuratPermohonan surat = new SuratPermohonan();

        //Homestay
        home.addHomestays("Bersmaa", 5, 2000000, TipeKamar.DELUXE, "Laguboti");

        //Komentar
        Komentar komentar = new Komentar();
        int awal, utama, sub;
        do {
            desa.menuLogin();
            System.out.print("Login sebagai : ");
            awal = scan.nextInt();
            if (awal == 1) {

                auten.loginPetugas();
                do {
                    desa.menuUtamaPetugas();
                    System.out.print("Pilih : ");
                    utama = scan.nextInt();
                    if (utama == 1) {
                        do {
                            for (int i = 0; i < Desa.length; i++) {
                                if (Desa[i].getNamaDesa() != null) {
                                    System.out.println("\n\t =======Profil Desa========");
                                    Desa[i].display();
                                }
                            }
                            System.out.println("1. Edit ");
                            System.out.println("0. Back");
                            System.out.print("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                desa.editProfil();
                                Desa[0].setDesa(namaDesa, lokasi, kades, wakades, sekdes, berdes);
                            }

                        } while (sub != 0);
                    }
                    if (utama == 2) {
                        do {
                            System.out.println("\n\t =======Peraturan Desa========");
                            for (int i = 0; i < PeraturanDesa.length; i++) {
                                if (PeraturanDesa[i].getJudul() != null) {
                                    System.out.println(i + 1 + ".");
                                    PeraturanDesa[i].display();
                                }
                            }
                            System.out.println("1. Tambah Peraturan");
                            System.out.println("2. Edit Peraturan");
                            System.out.println("3. Hapus Peraturan");
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                int x = 0;
                                int t = 0;
                                for (int i = 0; i < PeraturanDesa.length; i++) {
                                    if (PeraturanDesa[i].getJudul() == null) {
                                        t = i;
                                        x = 1;
                                        break;
                                    } else {

                                    }
                                }
                                if (x == 1) {
                                    System.out.println("==================================");
                                    System.out.printf("Judul : ");
                                    judul = scan.next();
                                    PeraturanDesa[t].setJudul(judul);
                                    System.out.printf("Tingkat Pelanggaran : ");
                                    Isi = scan.next();
                                    PeraturanDesa[t].setIsi(Isi);
                                    System.out.printf("Hukuman : ");
                                    hukuman = scan.next();
                                    PeraturanDesa[t].setHukuman(hukuman);
                                    System.out.println("==================================");
                                    System.out.println(" Data Sukses Ditambahkan ");
                                } else {
                                    System.out.println("Data gagal di tambahkan");
                                }
                            }

                            if (sub == 2) {
                                System.out.println("=====Edit Peraturan=====");
                                for (int i = 0; i < PeraturanDesa.length; i++) {
                                    if (PeraturanDesa[i].getJudul() != null) {
                                        System.out.println(i + 1 + ".");
                                        PeraturanDesa[i].display();
                                    }
                                }
                                System.out.println("Pilih aturan ke : ");
                                int in = scan.nextInt();
                                int ac = in - 1;
                                System.out.printf("Judul  : ");
                                judul = scan.next();
                                System.out.print("Tingkat : ");
                                Isi = scan.next();
                                System.out.printf("Hukuman : ");
                                hukuman = scan.next();
                                PeraturanDesa[ac].setPeraturanDesa(judul, Isi, hukuman);
                            }

                            if (sub == 3) {
                                System.out.printf("Masukkan aturan obat ke : ");
                                int in = scan.nextInt();
                                int ac = in - 1;
                                PeraturanDesa[ac].setPeraturanDesa(null, null, null);
                                System.out.println("-----Data Sukses di Hapus-----");
                                for (int i = ac + 1; i < PeraturanDesa.length; i++) {
                                    PeraturanDesa[i - 1] = PeraturanDesa[i];
                                }
                                PeraturanDesa[PeraturanDesa.length - 1].setPeraturanDesa(null, null, null);
                            }
                        } while (sub != 0);
                    }
                    if (utama == 3) {
                        int dl;
                        do {
                            System.out.println("======= Homestay =======");
                            home.tampilHomestay();
                            System.out.println("\n");

                            System.out.println("1. Tambah Homestay");
                            System.out.println("2. Edit Homestay");
                            System.out.println("3. Hapus Homestay");
                            System.out.println("4. Daftar Pemesan");
                            System.out.println("0. Keluar");
                            System.out.println("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                String nama, tipe, alamat;
                                int jumlah_kamar, harga;
                                System.out.printf("Nama : ");
                                nama = scan.next();
                                System.out.printf("Jumlah Kamar : ");
                                jumlah_kamar = scan.nextInt();
                                System.out.printf("Harga : ");
                                harga = scan.nextInt();
                                System.out.println("Pilihan : Standar, Delux, VIP");
                                System.out.printf("Tipe : ");
                                tipe = scan.next();
                                System.out.printf("Alamat : ");
                                alamat = scan.next();
                                home.addHomestays(nama, jumlah_kamar, harga, TipeKamar.valueOf(tipe), alamat);

                            }
                            if (sub == 2) {
                                String nama, tipe, alamat;
                                int jumlah_kamar, harga;
                                System.out.println("Pilih Homestay : ");
                                dl = scan.nextInt();

                                if (dl > 0) {
                                    System.out.printf("Nama : ");
                                    nama = scan.next();
                                    System.out.printf("Jumlah Kamar : ");
                                    jumlah_kamar = scan.nextInt();
                                    System.out.printf("Harga : ");
                                    harga = scan.nextInt();
                                    System.out.println("Pilihan : Standar, Delux, VIP");
                                    System.out.printf("Tipe : ");
                                    tipe = scan.next();
                                    System.out.printf("Alamat : ");
                                    alamat = scan.next();
                                    home.updateHomestay(nama, jumlah_kamar, harga, TipeKamar.valueOf(tipe), alamat, dl - 1);
                                } else {
                                    break;
                                }

                            }
                            if (sub == 3) {
                                System.out.println("Pilih Homestay : ");
                                dl = scan.nextInt();
                                if (dl > 0) {
                                    home.deleteHomestay(dl - 1);
                                } else {
                                    break;
                                }
                            }

                            if (sub == 4) {
                                int ops;
                                int jumlah_kamar;
                                String nama, status, lokasi;
                                long no_ktp;
                                pesan.show();
                                String satu = "Tolak";
                                String dua = "Terima";
                                //                            pesan.
                                System.out.println("Pilih pesanan : ");
                                ops = scan.nextInt();
                                System.out.println("Action :");
                                System.out.println("1. Terima");
                                System.out.println("2. Tolak");
                                System.out.println("Pilih");
                                //                            jumlah_kamar =
                                dl = scan.nextInt();
                                if (dl == 1) {
                                    pesan.updateHomestary(ops - 1, jumlah_kamar = pesan.pemesanan.get(ops - 1).jumlah_kamar, nama = pesan.pemesanan.get(ops - 1).nama, lokasi = pesan.pemesanan.get(ops - 1).lokasi, no_ktp = pesan.pemesanan.get(ops - 1).no_ktp, status = dua);
                                }
                                if (dl == 2) {
                                    pesan.updateHomestary(ops - 1, jumlah_kamar = pesan.pemesanan.get(ops - 1).jumlah_kamar, nama = pesan.nama, lokasi = pesan.pemesanan.get(ops - 1).lokasi, no_ktp = pesan.no_ktp, status = satu);
                                }
                            }

                        } while (sub != 0);
                    }

                    if (utama == 4) {
                        int dl;
                        do {
                            int stok, harga;
                            String nama;

                            System.out.println("======= Penjualan =======");
                            penjualan.tampilPenjualan();
                            System.out.println("\n");

                            System.out.println("1. Tambah Penjualan");
                            System.out.println("2. Edit Penjualan");
                            System.out.println("3. Hapus Penjualan");
                            System.out.println("0. Keluar");
                            System.out.println("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                System.out.printf("Nama : ");
                                nama = scan.next();
                                System.out.printf("Stok : ");
                                stok = scan.nextInt();
                                System.out.printf("Harga : ");
                                harga = scan.nextInt();

                                penjualan.addPenjualan(nama, stok, harga);

                            }
                            if (sub == 2) {

                                System.out.println("Pilih Penjualan : ");
                                dl = scan.nextInt();

                                if (dl > 0) {
                                    System.out.printf("Nama : ");
                                    nama = scan.next();
                                    System.out.printf("Stok : ");
                                    stok = scan.nextInt();
                                    System.out.printf("Harga : ");
                                    harga = scan.nextInt();

                                    penjualan.updatePenjualan(nama, stok, harga, dl - 1);
                                } else {
                                    break;
                                }

                            }
                            if (sub == 3) {
                                System.out.println("Pilih Homestay : ");
                                dl = scan.nextInt();
                                if (dl > 0) {
                                    penjualan.deletePenjualan(dl - 1);
                                } else {
                                    break;
                                }
                            }

                        } while (sub != 0);

                    }
                    if (utama == 5) {
                        int dl;
                        do {
                            System.out.println("======= Event =======");
                            event.tampilEvent();
                            System.out.println("1. Tambah Event");
                            System.out.println("2. Edit Event");
                            System.out.println("3. Hapus Event");
                            System.out.println("0. Keluar");
                            System.out.println("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                String kades, penyelanggara;
                                System.out.printf("Judul : ");
                                judul = scan.next();
                                System.out.printf("Tanggal : ");
                                kades = scan.next();
                                System.out.println("Penyelenggara : ");
                                penyelanggara = scan.next();
                                event.addEvent(judul, kades, penyelanggara);
                            }
                            if (sub == 2) {
                                String judul, kades, penyelanggara;
                                System.out.println("Pilih Event : ");
                                dl = scan.nextInt();

                                if (dl > 0) {
                                    System.out.printf("Judul : ");
                                    judul = scan.next();
                                    System.out.printf("Tanggal : ");
                                    kades = scan.next();
                                    System.out.println("Nama  Desa : ");
                                    penyelanggara = scan.next();
                                    event.updateEvent(dl - 1, judul, kades, penyelanggara);
                                } else {
                                    break;
                                }

                            }
                            if (sub == 3) {
                                System.out.println("Pilih Event : ");
                                dl = scan.nextInt();
                                if (dl > 0) {
                                    event.deleteEvent(dl - 1);
                                } else {
                                    break;
                                }
                            }

                        } while (sub != 0);
                    }
                    if (utama == 6) {
                        do {
                            System.out.println("Laporan Keuangan");
                            laporan.tampil();
                            System.out.println("1. Tambah Laporan");
                            System.out.println("2. Edit Laporan");
                            System.out.println("3. Hapus Laporan");
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                String isi, tanggal, biaya;
                                System.out.print("Perihal : ");
                                isi = scan.next();
                                System.out.print("Tanggal : ");
                                tanggal = scan.next();
                                System.out.print("Biaya : Rp.");
                                biaya = scan.next();
                                laporan.addLaporan(isi, tanggal, biaya);
                            }
                            if (sub == 2) {
                                int dl;
                                System.out.println("Pilih laporan yang akan diupdate : ");
                                dl = scan.nextInt();
                                String isi, tanggal, biaya;
                                System.out.print("Perihal : ");
                                isi = scan.next();
                                System.out.print("Tanggal : ");
                                tanggal = scan.next();
                                System.out.print("Biaya : Rp.");
                                biaya = scan.next();
                                laporan.updateLaporan(dl - 1, isi, tanggal, biaya);
                            }

                            if (sub == 3) {
                                int dl;
                                System.out.println("Pilih laporan yang akan dihapus : ");
                                dl = scan.nextInt();
                                laporan.deleteLaporan(dl - 1);
                            }
                        } while (sub != 0);

                    }
                    if (utama == 7) {
                        int a;
                        
                        System.out.println("\t======= Laporan ======");
                        System.out.println("1. Daftar Request Surat Permohonan");
                        System.out.println("2. Daftar Komentar");
                        System.out.println("0. Keluar");
                        a = scan.nextInt();
                        if (a == 1) {
                            System.out.println("\t====== Daftar Request =======");
                            surat.tampil();
                        }
                        if (a == 2) {
                            System.out.println("\t====== Daftar Komentar ======");
                            show.tampil();
                        }
                    }
                } while (utama != 0);

            }
            if (awal == 2) {
                auten.loginMasyarakat();
                do {
                    desa.menuUtamaMasyarakat();
                    System.out.print("Pilih : ");
                    utama = scan.nextInt();
                    if (utama == 1) {
                        do{
                            for (int i = 0; i < Desa.length; i++) {
                                if (Desa[i].getNamaDesa() != null) {
                                    System.out.printf(i + 1 + ".");
                                    Desa[i].display();
                                }
                            }
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                        }while(sub !=0);
                    }
                    if (utama == 2) {
                        do{    
                            System.out.println("\n\t =======Peraturan Desa========");
                            for (int i = 0; i < PeraturanDesa.length; i++) {
                                if (PeraturanDesa[i].getJudul() != null) {
                                    System.out.println(i + 1 + ".");
                                    PeraturanDesa[i].display();
                                }
                            }
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                        }while(sub !=0);
                    }
                    if (utama == 3) {
                        do{
                            event.tampilEvent();
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                        }while(sub !=0);
                    }
                    if (utama == 4) {
                        do {
                            System.out.println("\t======== Daftar Homestay =======");
                            home.tampilHomestay();
                            System.out.println("\n\t======== Daftar Pemesanan =======");
                            pesan.show();
                            System.out.println("\n");
                            int dl;
                            int jumlah_kamar,jumlah,total,alamat1;
                            String nama1, status, lokasi1 = null;
                            long no_ktp;
                            System.out.println("Homestay no : ");
                            dl = scan.nextInt();
                            int pos = dl - 1;

                            for (int i = 0; i < home.homestay.size(); i++) {
                                if (pos == i) {
                                    System.out.println(home.homestay.get(i).nama);
                                    lokasi1 = home.homestay.get(i).nama;
                                }
                            }
                            System.out.print("Nama : ");
                            nama1 = scan.next();
                            System.out.print("No KTP :");
                            no_ktp = scan.nextLong();
                            System.out.print("Jumlah Kamar : ");
                            jumlah_kamar = scan.nextInt();
                            for (int i = 0; i < home.homestay.size(); i++) {
                                if (pos == i) {
                                    System.out.println(home.homestay.get(i).nama);
                                    System.out.println("Hosea");
                                    jumlah = home.homestay.get(i).jumlah_kamar- jumlah_kamar;
                                    System.out.println(jumlah);
                                    home.updateHomestay(home.homestay.get(dl-1).nama , home.homestay.get(dl-1).jumlah_kamar= jumlah, utama = home.homestay.get(dl-1).harga, home.homestay.get(dl-1).tipeKamar.VIP,  home.homestay.get(dl-1).alamat, dl-1);
                                    
                                }
                            }
                            System.out.print("Total Harga : Rp.");
                            for(int i = 0;i<home.homestay.size();i++){
                                if(pos==i){
                                    total = jumlah_kamar * home.homestay.get(i).harga;
                                    System.out.println(total);
                                }
                            }
                            int asd;
                            System.out.println("Apakah anda yakin memesan ?");
                            System.out.println("1. Ya\n2. Tidak");
                            asd = scan.nextInt();
                            if(asd == 1){
                                pesan.pesanHomestay(jumlah_kamar, nama1, no_ktp, lokasi1, status = "Proses");
                            }
                            else if(asd == 2){
                                break;
                            }
                            for (int i = 0; i < home.homestay.size(); i++) {
                                if (pos == i) {
                                    if(home.homestay.get(i).jumlah_kamar<0){
                                        System.out.println("Kamar Tidak Mencukupi");
                                        pesan.hapusPemesanan(i);
                                    }
                                }
                            }
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();

                        } while (sub != 0);
                    }
                    if (utama == 5) {
                        String hal, nama;
                        System.out.println("\t======= Surat Permohonan =======");
                        System.out.print("Perihal : ");
                        hal = scan.next();
                        System.out.print("Atas Nama : ");
                        nama = scan.next();
                        surat.addPermohonan(hal, nama);
                    }
                    if (utama == 6) {
                        int dl;
                        do {
                            int stok, harga;
                            String nama;

                            System.out.println("======= Penjualan =======");
                            penjualan.tampilPenjualan();
                            System.out.println("\n");

                            System.out.println("1. Tambah Penjualan");
                            System.out.println("2. Edit Penjualan");
                            System.out.println("3. Hapus Penjualan");
                            System.out.println("0. Keluar");
                            System.out.println("Pilih : ");
                            sub = scan.nextInt();
                            if (sub == 1) {
                                System.out.printf("Nama : ");
                                nama = scan.next();
                                System.out.printf("Stok : ");
                                stok = scan.nextInt();
                                System.out.printf("Harga : ");
                                harga = scan.nextInt();

                                penjualan.addPenjualan(nama, stok, harga);

                            }
                            if (sub == 2) {

                                System.out.println("Pilih Penjualan : ");
                                dl = scan.nextInt();

                                if (dl > 0) {
                                    System.out.printf("Nama : ");
                                    nama = scan.next();
                                    System.out.printf("Stok : ");
                                    stok = scan.nextInt();
                                    System.out.printf("Harga : ");
                                    harga = scan.nextInt();

                                    penjualan.updatePenjualan(nama, stok, harga, dl - 1);
                                } else {
                                    break;
                                }

                            }
                            if (sub == 3) {
                                System.out.println("Pilih Penjualan : ");
                                dl = scan.nextInt();
                                if (dl > 0) {
                                    penjualan.deletePenjualan(dl - 1);
                                } else {
                                    break;
                                }
                            }

                        } while (sub != 0);

                    }
                    if (utama == 7) {
                        do{
                            System.out.println("Laporan Keuangan");
                            laporan.tampil();
                            System.out.println("0. Keluar");
                            sub = scan.nextInt();
                        }while(sub!=0);
                    }
                    if (utama == 8) {
                        String koment;
                        System.out.println("\t========== Komentar ==========");
                        System.out.print("Komentar : ");
                        koment = scan.next();
                        komen.addKomentar(koment);
                    }
                } while (utama != 0);
            }
        } while (awal != 0);
    }

    public void menuLogin() {
        System.out.println("\t======= Login =======");
        System.out.println("1. Login Petugas");
        System.out.println("2. Login Masyarakat");
        System.out.println("0. Keluar");
    }

    public void menuUtamaPetugas() {
        System.out.println("\t========= Selamat Datang ==========");
        System.out.println("\t   ====== Perangkat Desa =======");
        System.out.println("1. Kelola Profil Desa");
        System.out.println("2. Kelola Peraturan Desa");
        System.out.println("3. Kelola HomeStay");
        System.out.println("4. Kelola Penjualan");
        System.out.println("5. Kelola Event");
        System.out.println("6. Kelola Laporan Keuangan");
        System.out.println("7. Laporan");
        System.out.println("0. Back");
    }

    public void menuUtamaMasyarakat() {
        System.out.println("\t========= Selamat Datang ==========");
        System.out.println("\t   ======   Masyarakat   =======");
        System.out.println("1. Profil Desa");
        System.out.println("2. Peraturan Desa");
        System.out.println("3. Informasi Event");
        System.out.println("4. Pemesanan HomeStay");
        System.out.println("5. Request Surat Permohonan");
        System.out.println("6. Kelola Penjualan");
        System.out.println("7. Laporan Keuangan");
        System.out.println("8. Komentar");
        System.out.println("0. Back");
    }

    public void editProfil() {
        System.out.println("\t========Edit Profil Desa=======");
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama Desa : ");
        namaDesa = scan.next();
        System.out.print("Lokasi : ");
        lokasi = scan.next();
        System.out.print("Kepala Desa : ");
        kades = scan.next();
        System.out.print("Wakil Kepala Desa : ");
        wakades = scan.next();
        System.out.print("Sekertaris Desa : ");
        sekdes = scan.next();
        System.out.print("Bendahara Desa : ");
        berdes = scan.next();
    }

}