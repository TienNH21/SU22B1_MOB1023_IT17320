package buoi2_interface;

public class Chicken implements Animal {
    @Override
    public void an()
    {
        System.out.println("Thóc, cơm");
    }
    
    @Override
    public void diChuyen()
    {
        System.out.println("Chạy, nhảy");
    }
    
    @Override
    public void tiengKeu()
    {
        System.out.println("Gáy...");
    }
}
