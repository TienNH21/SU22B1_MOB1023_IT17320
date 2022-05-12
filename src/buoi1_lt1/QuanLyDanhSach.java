package buoi1_lt1;

import java.util.ArrayList;

public class QuanLyDanhSach {
    private ArrayList<Nguoi> ds;
    
    public QuanLyDanhSach() {
        this.ds = new ArrayList<Nguoi>();
    }
    
    public void insert(Nguoi n)
    {
        this.ds.add(n);
    }
    
    public ArrayList<Nguoi> getList()
    {
        return this.ds;
    }
}
