package ppdb.dao;

import java.util.List;
import ppdb.model.*;
import java.util.List;
import ppdb.list.siswa.viewSiswa;

/**
 *
 * @author HP
 */
public interface implementSiswa {
      
    public void insert(viewSiswa vs);
    
    public void update(viewSiswa vs);
    
    public void delete(int id);
    
    public List<viewSiswa> getAll();
    
    public List<viewSiswa> getCariNama(String nama);
}
