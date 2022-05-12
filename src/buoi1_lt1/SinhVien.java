package buoi1_lt1;

public class SinhVien extends Nguoi {
    private String maSv;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String chuyenNganh, String hoTen, String diaChi, int gioiTinh) {
        super(hoTen, diaChi, gioiTinh);
        this.maSv = maSv;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    @Override
    public String xuatThongTin()
    {
        return super.xuatThongTin() + this.maSv + "-" + this.chuyenNganh;
    }
}
