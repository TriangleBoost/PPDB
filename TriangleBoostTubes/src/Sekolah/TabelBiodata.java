/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package Sekolah;

import javax.swing.table.*;
public class TabelBiodata extends DefaultTableModel {
    
    private String[] namaKolom;
    
    // SETTING NAMA KOLOM TABEL SISWA
    public TabelBiodata() {
        this.namaKolom = new String[]{
            "NISN","Nama","Tanggal Lahir","Jenis Kelamin","Agama","No Telepon"
        };
    }
    
    // GETTER NAMA KOLOM
    public String[] getNamaKolom() {
        return this.namaKolom;
    }   
}