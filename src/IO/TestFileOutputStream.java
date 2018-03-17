package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args) {
        int b=0;
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("C:\\Users\\10579\\Desktop\\test.txt");
            out=new FileOutputStream("C:\\Users\\10579\\Desktop\\out.txt");
            while((b=in.read())!=-1){
                out.write(b);
            }
            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            System.exit(-1);

        } catch (IOException e2) {
            System.out.println("文件复制错误");
            System.exit(-1);
        }
        System.out.println("文件已复制");
    }
}
