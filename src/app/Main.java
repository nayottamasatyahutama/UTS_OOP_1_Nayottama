/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nayo
 */
public class Main {

    public static void main(String args[]) {
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime today = LocalDateTime.now();

        Main app = new Main();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Date : " + date.format(today));
             System.out.println("Time : " + time.format(today));
            app.printMenu();
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("==========================");
                    System.out.println("Formulir Tambah Data");
                    System.out.println("==========================");
                    app.addData();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("Formulir Ubah Data");
                    System.out.println("==========================");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("Formulir Hapus Data");
                    System.out.println("==========================");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("Daftar Data");
                    System.out.println("==========================");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
        List<dataMahasiswa> result = method.getListData();
        int jumlah_data = result.size();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Hapus data perekaman ke : ");
        int index = Integer.parseInt(sc.nextLine()) - 1;

        //Pengantisipasi error karena pemilihan data tidak benar
        if (index < jumlah_data && index >= 0) {
            // proses hapus data
            method.removeData(index);
            System.out.println("Berhasil menghapus data mahasiswa ke-" + (index + 1));
            System.out.println("");
        } else {
            //Handle error
            System.out.println("Maaf, data tidak ditemukan");
            System.out.println("");
        }

    }

    public void ubahData() {
        List<dataMahasiswa> result = method.getListData();
        int jumlah_data = result.size();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Ubah data perekaman ke : ");
        int index = Integer.parseInt(sc.nextLine()) - 1;
        System.out.println("=====================================");

        //Pengantisipasi error karena pemilihan data tidak benar
        if (index < jumlah_data && index >= 0) {
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Semester : ");
            String semester = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("Usia : ");
            String usia = sc.nextLine();
            System.out.print("Gender : ");
            String gender = sc.nextLine();
            System.out.print("Alamat : ");
            String alamat = sc.nextLine();
            System.out.print("Prodi : ");
            String prodi = sc.nextLine();

            // Proses Ubah
            method.editData(new dataMahasiswa(nim, nama, semester, kelas, usia, gender, alamat, prodi), index);
        } else {
            //handle error
            System.out.println("Maaf, urutan data perekaman tidak ditemukan");
            System.out.println("");
        }

    }

    public void listData() {
        List<dataMahasiswa> result = method.getListData();
        for (int index = 0; index < result.size(); index++) {
            System.out.println();
            System.out.println("Data mahasiswa " + (index + 1));
            System.out.println("=======================================================");
            System.out.println("  NIM : " + result.get(index).getNim());
            System.out.println("  Nama : " + result.get(index).getNama());
            System.out.println("  Semester : " + result.get(index).getSemester());
            System.out.println("  Kelas : " + result.get(index).getKelas());
            System.out.println("  Usia : " + result.get(index).getUsia());
            System.out.println("  Gender : " + result.get(index).getGender());
            System.out.println("  Alamat : " + result.get(index).getAlamat());
            System.out.println("  Prodi : " + result.get(index).getProdi());
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Semester : ");
        String semester = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Usia : ");
        String usia = sc.nextLine();
        System.out.print("Gender : ");
        String gender = sc.nextLine();
        System.out.print("Alamat : ");
        String alamat = sc.nextLine();
        System.out.print("Prodi : ");
        String prodi = sc.nextLine();
        // proses tambah data
        method.addData(new dataMahasiswa(nim, nama, semester, kelas, usia, gender, alamat, prodi));
    }

    public void printMenu() {
        System.out.println("-------------------------------");
        System.out.println("Aplikasi Perekaman Data Mahasiswa");
        System.out.println("-------------------------------");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }

}
