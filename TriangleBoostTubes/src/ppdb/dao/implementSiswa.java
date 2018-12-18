/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package ppdb.dao;

import java.util.List;
import ppdb.model.*;
import ppdb.view.*;
public interface implementSiswa {
    
    public void insert(viewSiswa vs);
    
    public void update(viewSiswa vs);
    
    public void delete(int id);
    
    public List<viewSiswa> getAll();
    
    public List<viewSiswa> getCariNama(String nama);
}
