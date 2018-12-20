/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppdb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ppdb.koneksi.Koneksi;
import ppdb.siswa.Ortu;
import ppdb.view.viewSiswa;

/**
 *
 * @author MSI Notebook
 */
public class ortuDao implements implementSiswa {
    Connection connect ;
    
    final String insert = "Insert into ortu (nama_ayah, pekerjaan_ayah, gaji_ayah, no_telp_ayah, alamat_ayah, nama_ibu, pekerjaan_ibu, gaji_ibu, no_telp_ibu, alamat_ibu) VALUES (?,?,?,?,?,?,?,?,?,?)" ;
    final String update = "Update ortu set nama_ayah=? , pekerjaan_ayah=? , gaji_ayah=? , no_telp_ayah=? , alamat_ayah=? , nama_ibu=? , pekerjaan_ibu=? , gaji_ibu=? , no_telp_ibu=? , alamat_ibu=? : " ;
    final String delete = "Delete from ortu where id=? : " ;
    final String select = "select * from ortu" ;
    final String carinama = "select * from ortu where id like ? : " ;
    
    public ortuDao() {
        connect = Koneksi.connection() ;
    }

// ------------------------------INSERT---------------------------------
    public boolean insert (Ortu ortu) {
        PreparedStatement statement = null ;
        try {
            statement=connect.prepareStatement(insert) ;
            statement.setString(1 , ortu.getNamaAyah()) ;
            statement.setString(2 , ortu.getPekerjaanAyah()) ;
            statement.setString(3 , ortu.getGajiAyah()) ;
            statement.setString(4 , ortu.getTelpAyah()) ;
            statement.setString(5 , ortu.getAlamatAyah()) ;
            statement.setString(6 , ortu.getNamaIbu()) ;
            statement.setString(7 , ortu.getPekerjaanIbu()) ;
            statement.setString(8 , ortu.getGajiIbu()) ;
            statement.setString(9 , ortu.getTelpIbu()) ;
            statement.setString(10 , ortu.getAlamatIbu()) ;
            int i = statement.executeUpdate() ;
            if (i == 1) {
                return true ;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()) ;
        }
        return false ;
    }
    
    
// ------------------------------UPDATE---------------------------------
    public boolean update (Ortu ortu) {
        PreparedStatement statement = null ;
        try {
            statement=connect.prepareStatement(update) ;
            statement.setString(1 , ortu.getNamaAyah()) ;
            statement.setString(2 , ortu.getPekerjaanAyah()) ;
            statement.setString(3 , ortu.getGajiAyah()) ;
            statement.setString(4 , ortu.getTelpAyah()) ;
            statement.setString(5 , ortu.getAlamatAyah()) ;
            statement.setString(6 , ortu.getNamaIbu()) ;
            statement.setString(7 , ortu.getPekerjaanIbu()) ;
            statement.setString(8 , ortu.getGajiIbu()) ;
            statement.setString(9 , ortu.getTelpIbu()) ;
            statement.setString(10 , ortu.getAlamatIbu()) ;
            int i = statement.executeUpdate() ;
            if (i == 1) {
                return true ;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()) ;
        }
        return false ;
    }
    
 
// ------------------------------DELETE---------------------------------
    public void delete (int id) {
        PreparedStatement statement = null ;
        try {
            statement=connect.prepareStatement(delete) ;
            
            statement.setInt(1 , id) ;
            statement.executeUpdate() ;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close() ;
            } catch (SQLException e) {
                e.printStackTrace() ;
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
                Sv.setNamaAyah(rs.getString("nama_ayah"));
                Sv.setPekerjaanAyah(rs.getString("pekerjaan_ayah"));
                Sv.setGajiAyah(rs.getString("gaji_ayah"));
                Sv.setTelpAyah(rs.getString("no_telp_ayah"));
                Sv.setAlamatAyah(rs.getString("alamat_ayah"));
                Sv.setNamaIbu(rs.getString("nama_ibu"));
                Sv.setPekerjaanIbu(rs.getString("pekerjaan_ibu"));
                Sv.setGajiIbu(rs.getString("gaji_ibu"));
                Sv.setTelpIbu(rs.getString("no_telp_ibu"));
                Sv.setAlamatIbu(rs.getString("alamat_ibu"));
                vs.add(Sv) ;
            }
        } catch (Exception e) {
            Logger.getLogger(ortuDao.class.getName()).log(Level.SEVERE, null, e) ;
        }
        return vs ;
    }

    
// ------------------------------CARINAMA---------------------------------
    public List<viewSiswa> getCariNama (String nama) {
        List<viewSiswa> vs = null ;
        try {
            vs = new ArrayList<viewSiswa>() ;
            PreparedStatement st = connect.prepareStatement(carinama) ;
            st.setString (1 , "%" + nama + "") ;
            ResultSet rs = st.executeQuery() ;
            while (rs.next()) {
                viewSiswa Sv = new viewSiswa() ;
                Sv.setNamaAyah(rs.getString("nama_ayah"));
                Sv.setPekerjaanAyah(rs.getString("pekerjaan_ayah"));
                Sv.setGajiAyah(rs.getString("gaji_ayah"));
                Sv.setTelpAyah(rs.getString("no_telp_ayah"));
                Sv.setAlamatAyah(rs.getString("alamat_ayah"));
                Sv.setNamaIbu(rs.getString("nama_ibu"));
                Sv.setPekerjaanIbu(rs.getString("pekerjaan_ibu"));
                Sv.setGajiIbu(rs.getString("gaji_ibu"));
                Sv.setTelpIbu(rs.getString("no_telp_ibu"));
                Sv.setAlamatIbu(rs.getString("alamat_ibu"));
                vs.add(Sv) ;
            }
        } catch (Exception e) {
            Logger.getLogger(ortuDao.class.getName()).log(Level.SEVERE, null, e) ;
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
