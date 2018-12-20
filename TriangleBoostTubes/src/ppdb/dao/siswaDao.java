/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package ppdb.dao;

import ppdb.koneksi.Koneksi;
import ppdb.model.tableModelSiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static ppdb.koneksi.Koneksi.connection;
import ppdb.siswa.Biodata;
import ppdb.view.viewSiswa;

public class siswaDao implements implementSiswa {
    Connection connect;
    
    final String insert = "Insert into siswa (nisn , nama , tempat , tanggal_lahir , jenis_kelamin , agama , no_telp , alamat) VALUES (?,?,?,?,?,?,?,?) ";
    final String update = "Update siswa set NISN=? , Nama=? , Tempat=? , Tanggal_lahir=? , Agama=? , No_telp=? , alamat=? : ";
    final String delete = "Delete from siswa where id_siswa=? : ";
    final String select = "select * from siswa";
    final String carinama = "select * from siswa where id_siswa like ? :";
    
    public siswaDao() {
        connect = Koneksi.connection();
    }
    
    public boolean insert (Biodata bio) {
        PreparedStatement statement = null ;
        try {
           statement=connect.prepareStatement(insert) ;
           statement.setString(1, bio.getNisn());
           statement.setString(2, bio.getNama());
           statement.setString(3, bio.getTmptLahir());
           statement.setString(4, bio.getTglLahir());
           statement.setString(5, bio.getAgama());
           statement.setString(6, bio.getKelamin());
           statement.setString(7, bio.getTelp());
           statement.setString(8, bio.getAlamat());
           int i = statement.executeUpdate();
           if(i == 1) {
               return true;
           }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void insert(viewSiswa vs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(viewSiswa vs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<viewSiswa> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<viewSiswa> getCariNama(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}