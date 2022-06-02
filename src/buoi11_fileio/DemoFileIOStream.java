package buoi11_fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoFileIOStream {
    public static void main(String[] args) {
        String filename = "file_io.txt";
        ghiFile(filename);
        docFile(filename);
    }
    
    public static void ghiFile(String filename) {
        File f = new File(filename);
        if (f.exists() == true) {
            System.out.println("File đã tồn tại");
        } else {
            System.out.println("File ko tồn tại");
        }
        
        String data = "Hello IT17320";
        try {
            FileOutputStream fos = new FileOutputStream(f);
            byte[] b = data.getBytes();
            fos.write(b);
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ko tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Lỗi vào ra");
            e.printStackTrace();
        }
    }
    
    public static void docFile(String filename) {
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File ko tồn tại");
            return ;
        }
        
        try {
            FileInputStream fis = new FileInputStream(f);
            
            while (true) {
                int i = fis.read();
                if (i == -1) {
                    break;
                }
                
                char c = (char) i;
                System.out.print(c);
            }
            
            System.out.println("");
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ko tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Lỗi vào ra");
            e.printStackTrace();
        }
        
    }
}
