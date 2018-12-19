/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package ppdb.model;


import java.util.List;
import javax.swing.table.AbstractTableModel;
import ppdb.list.siswa.viewSiswa;

public class tableModelSiswa extends AbstractTableModel {

    
    List<viewSiswa> list; 

    public tableModelSiswa(List<viewSiswa> list) {
        this.list = list;
    }
    
    // =============================================
    
    // MENDAPATKAN BARIS KOLOM
    public int getRowCount() { 
        return list.size();
    }
    
    @Override
    // GET NAMA KOLOM
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "NISN";
            case 1:
                return "Nama";
            case 2:
                return "Jenis Kelamin";
            case 3:
                return "Nilai Matematika";
            case 4:
                return "Nilai IPA";
            case 5:
                return "Nilai Bahasa Indonesia";
            case 6:
                return "Nilai Bahasa Inggris";
            default:
                return null;
        }
    }
    
    @Override
    // SETTING JUMLAH KOLOM DAN GET JMLH KOLOM
    public int getColumnCount() { 
        return 6;
    }
    
    @Override
    // GET VALUE AND PUT IT TO getColumnName
    public Object getValueAt(int baris, int column) {
        switch(column){
            
            case 0:
                return list.get(baris).getNisn();
            case 1:
                return list.get(baris).getNama();
            case 2:
                return list.get(baris).getJenisKelamin();
            case 3:
                return list.get(baris).getNilaiMat();
            case 4:
                return list.get(baris).getNilaiIpa();
            case 5:
                return list.get(baris).getNilaiBindo();
            case 6:
                return list.get(baris).getNilaiInggris();
            default:
                return null;
        }
    }
    // =============================================
    
}
