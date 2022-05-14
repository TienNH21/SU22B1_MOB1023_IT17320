package buoi1_lt1;

import java.util.ArrayList;

public interface NguoiDAOInterface {
    public void insert(Nguoi nguoi);
    public void update(int viTri, Nguoi nguoi);
    public void delete(int viTri);
    public ArrayList<Nguoi> getList();
    public Nguoi getById(int viTri);
}
