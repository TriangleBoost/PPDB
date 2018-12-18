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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class dao implements implementSiswa {
    Connection connect;
    
    final String insert = "";
    final String update = "";
    final String delete = "";
    final String select = "";
    final String carinama = "";
    
    public dao(){
        connect = Koneksi.connection();
    }
}
