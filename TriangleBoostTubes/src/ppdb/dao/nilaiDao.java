/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppdb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
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
    final String delete = "Delete from nilai where id = ? :" ;
    final String select = "select * from nilai" ;
    final String carinama = "select * from nilai where id like ? :" ;
    
    public nilaiDao() {
        connect = Koneksi.connection() ;
    }
    
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