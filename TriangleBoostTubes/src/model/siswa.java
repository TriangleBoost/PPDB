/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package model;
public class siswa {
    private Integer id;
    private String nisn,nama,telp,alamat;
    private String Matematika,Inggris,Indonesia,Ipa;

    public siswa() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNisn() {
        return nisn;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // ==================== SETTER GETTER NILAI PELAJARAN
    public String getMatematika() {
        return Matematika;
    }

    public void setMatematika(String Matematika) {
        this.Matematika = Matematika;
    }

    public String getInggris() {
        return Inggris;
    }

    public void setInggris(String Inggris) {
        this.Inggris = Inggris;
    }

    public String getIndonesia() {
        return Indonesia;
    }

    public void setIndonesia(String Indonesia) {
        this.Indonesia = Indonesia;
    }

    public String getIpa() {
        return Ipa;
    }

    public void setIpa(String Ipa) {
        this.Ipa = Ipa;
    }
    
}