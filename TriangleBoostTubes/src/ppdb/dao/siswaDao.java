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
    
// ------------------------------INSERT---------------------------------    
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
    
    
// ------------------------------UPDATE---------------------------------
    public boolean update (Biodata bio) {
        PreparedStatement statement = null ;
        try {
           statement=connect.prepareStatement(update) ;
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
    
    
// ------------------------------DELETE---------------------------------   
    public void delete (int id_siswa) {
        PreparedStatement statement = null ;
        try {
            statement = connect.prepareStatement(delete) ;
            
            statement.setInt(1 , id_siswa) ;
            statement.executeUpdate() ;
        } catch (SQLException e) {
            e.printStackTrace() ;
        } finally {
            try {
                statement.close() ;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
// ------------------------------SELECT---------------------------------  
    public List<viewSiswa> getAll() {
        List<viewSiswa> vs = null ;
        try {
            vs = new ArrayList<viewSiswa>() ;
            Statement st = connect.createStatement() ;
            ResultSet rs = st.executeQuery(select) ;
            while (rs.next()) {
                viewSiswa Sv = new viewSiswa() ;
                Sv.setNisn(rs.getString("nisn")) ;
                Sv.setNama(rs.getString("nama")) ;
                Sv.setTempat(rs.getString("tempat")) ;
                Sv.setTgllahir(rs.getString("tanggal_lahir")) ;
                Sv.setJenisKelamin(rs.getString("jenis_kelamin")) ;
                Sv.setAgama(rs.getString("agama")) ;
                Sv.setTelp(rs.getString("no_telp")) ;
                Sv.setAlamat(rs.getString("alamat")) ;
                vs.add(Sv) ;
            }
        } catch (SQLException e) {
            Logger.getLogger(siswaDao.class.getName()).log(Level.SEVERE, null , e) ;
        }
        return vs ;
    }
    
 
// ------------------------------CARINAMA---------------------------------
        public List<viewSiswa> getCariNama(String nama) {
        List<viewSiswa> vs = null ;
        try {
            vs = new ArrayList<viewSiswa>() ;
            PreparedStatement st = connect.prepareStatement(carinama) ;
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery(select) ;
            while (rs.next()) {
                viewSiswa Sv = new viewSiswa() ;
                Sv.setNisn(rs.getString("nisn")) ;
                Sv.setNama(rs.getString("nama")) ;
                Sv.setTempat(rs.getString("tempat")) ;
                Sv.setTgllahir(rs.getString("tanggal_lahir")) ;
                Sv.setJenisKelamin(rs.getString("jenis_kelamin")) ;
                Sv.setAgama(rs.getString("agama")) ;
                Sv.setTelp(rs.getString("no_telp")) ;
                Sv.setAlamat(rs.getString("alamat")) ;
                vs.add(Sv) ;
            }
        } catch (SQLException e) {
            Logger.getLogger(siswaDao.class.getName()).log(Level.SEVERE, null , e) ;
        }
        return vs ;
    }
        
        
    @Override
    public void insert(viewSiswa vs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(viewSiswa vs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}