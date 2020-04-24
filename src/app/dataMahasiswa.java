/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Nayo
 */
public class dataMahasiswa {

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    private String nim;
    private String nama;
    private String semester;
    private String kelas;
    private String usia;
    private String gender;
    private String alamat;
    private String prodi;
    
    public dataMahasiswa() {
        nim = "";
        nama = "";
        semester = "";
        kelas = "";
        usia = "";
        gender = "";
        alamat = "";
        prodi = "";
    }
    public dataMahasiswa(String nim, String nama, String semester, String kelas, String usia, String gender, String alamat, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.kelas = kelas;
        this.usia = usia;
        this.gender = gender;
        this.alamat = alamat;
        this.prodi = prodi;
    }
}
