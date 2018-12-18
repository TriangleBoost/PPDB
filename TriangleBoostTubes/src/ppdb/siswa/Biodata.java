/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppdb.siswa;

/**
 *
 * @author Dhandy
 */
public class Biodata {
    String nisn, nama, tmptLahir, tglLahir,
            kelamin, agama, telp, alamat, anak, bersaudara;

    public Biodata(String nisn, String nama, String tmptLahir, String tglLahir, String kelamin, String agama, String telp, String alamat, String anak, String bersaudara) {
        this.nisn = nisn;
        this.nama = nama;
        this.tmptLahir = tmptLahir;
        this.tglLahir = tglLahir;
        this.kelamin = kelamin;
        this.agama = agama;
        this.telp = telp;
        this.alamat = alamat;
        this.anak = anak;
        this.bersaudara = bersaudara;
    }

    public String getNisn() {
        return nisn;
    }

    public String getNama() {
        return nama;
    }

    public String getTmptLahir() {
        return tmptLahir;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public String getKelamin() {
        return kelamin;
    }

    public String getAgama() {
        return agama;
    }

    public String getTelp() {
        return telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getAnak() {
        return anak;
    }

    public String getBersaudara() {
        return bersaudara;
    }
    
    
}
