/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppdb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
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
