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
import ppdb.siswa.Nilai;
import ppdb.view.viewSiswa;

/**
 *
 * @author Dhandy
 */
public class nilaiDao implements implementSiswa {
    Connection connect ;
    
    final String insert = "Insert into nilai (nilai_mat, nilai_bindo , nilai_bing , nilai_ipa , ratarata) VALUES (?,?,?,?,?)" ;
    final String update = "Update nilai set nilai_mat =? , nilai_bindo =? , nilai_bing =? , nilai_ipa =? , ratarata =? : " ;
    final String delete = "Delete from nilai where id_nilai = ? :" ;
    final String select = "select * from nilai" ;
    final String carinama = "select * from nilai where id_nilai like ? :" ;
    
    public nilaiDao() {
        connect = Koneksi.connection() ;
    }
// ------------------------------INSERT---------------------------------   
    public boolean insert (Nilai nilai) {
        PreparedStatement statement = null ;
        try {
            statement=connect.prepareStatement(insert) ;
            statement.setFloat(1,nilai.getMtk()) ;
            statement.setFloat(2,nilai.getBindo()) ;
            statement.setFloat(3,nilai.getBing()) ;
            statement.setFloat(4,nilai.getIpa()) ;
            statement.setFloat(5,nilai.getRataRata()) ;
            
            int i = statement.executeUpdate();
            if (i == 1) {
                return true ;
            }
        } catch (SQLException e) {
            
        }
        return false ;
    }
    
    
    
// ------------------------------update---------------------------------    
        public boolean update (Nilai nilai) {
        PreparedStatement statement = null ;
        try {
            statement=connect.prepareStatement(update) ;
            statement.setFloat(1,nilai.getMtk()) ;
            statement.setFloat(2,nilai.getBindo()) ;
            statement.setFloat(3,nilai.getBing()) ;
            statement.setFloat(4,nilai.getIpa()) ;
            statement.setFloat(5,nilai.getRataRata()) ;
            
            int i = statement.executeUpdate();
            if (i == 1) {
                return true ;
            }
        } catch (SQLException e) {
            
        }
        return false ;
    }
        
        
// ------------------------------DELETE---------------------------------        
        public void delete (int id_nilai) {
            PreparedStatement statement = null ;
            try {
                statement=connect.prepareStatement(delete) ;
                
                statement.setInt(1 , id_nilai) ;
                statement.executeUpdate() ;
            } catch (SQLException e) {
                e.printStackTrace();
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
                    Sv.setNilaiMat(rs.getFloat("nilai_mat")) ;
                    Sv.setNilaiBindo(rs.getFloat("nilai_bindo")) ;
                    Sv.setNilaiInggris(rs.getFloat("nilai_bing")) ;
                    Sv.setNilaiIpa(rs.getFloat("nilai_ipa")) ;
                    Sv.setNilaiIpa(rs.getFloat("nilai_ipa")) ;
                    Sv.setRataRata(rs.getFloat("ratarata")) ;
                    vs.add(Sv) ;
                }
            } catch (Exception e) {
                Logger.getLogger(nilaiDao.class.getName()).log(Level.SEVERE, null, e) ;
            }
            
            return vs ;
        }
        
        
// ------------------------------CARINAMA---------------------------------
        public List<viewSiswa> getCariNama(String nama) {
            List<viewSiswa> vs = null ;
            try {
                vs = new ArrayList<viewSiswa>() ;
                PreparedStatement st = connect.prepareStatement(carinama) ;
                st.setString(1 , "%" + nama + "%") ;
                ResultSet rs = st.executeQuery() ;
                while (rs.next()) {
                    viewSiswa Sv = new viewSiswa () ;
                    Sv.setNilaiMat(rs.getFloat("nilai_mat")) ;
                    Sv.setNilaiBindo(rs.getFloat("nilai_bindo")) ;
                    Sv.setNilaiInggris(rs.getFloat("nilai_bing")) ;
                    Sv.setNilaiIpa(rs.getFloat("nilai_ipa")) ;
                    Sv.setNilaiIpa(rs.getFloat("nilai_ipa")) ;
                    Sv.setRataRata(rs.getFloat("ratarata")) ;
                    vs.add(Sv) ;
                }
            } catch (Exception e) {
                Logger.getLogger(nilaiDao.class.getName()).log(Level.SEVERE, null, e) ;
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
