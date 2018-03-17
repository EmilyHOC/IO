package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) {
        FileReader fr=null;
        int c=0;
        try{
            fr=new FileReader("C:\\Users\\10579\\Desktop\\test.txt");
            int ln=0;
            while ((c=fr.read())!=-1){
                System.out.println((char) c);
            }
            fr.close();
        }catch (FileNotFoundException e){
            System.out.println("找不到指定的文件");
        }
        catch (IOException e) {
            System.out.println("文件读取错误");
        }

    }
}
