/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package ppdb.koneksi;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
//import java.sql.Connection;
import java.sql.SQLException;

public class Koneksi {
    static Connection con;
    
    public static Connection connection(){
        if( con == null ){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("project_java");
            data.setUser("root");
            data.setPassword("");
            try {
                con = data.getConnection();
                System.out.println("Database connected !");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return con;
    }
}