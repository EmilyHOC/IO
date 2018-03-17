package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferStream {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("C:\\Users\\10579\\Desktop\\out.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            int c=0;
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            bis.mark(100);
            for(int i=0;i<=10&&(c=bis.read())!=-1;i++){
                System.out.print((char) c+"");
            }
            System.out.println();
            bis.reset();
            for(int i=0;i<10&&(c=bis.read())!=-1;i++){
                System.out.print((char) c+"");
            }
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
