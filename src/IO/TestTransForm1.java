package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestTransForm1 {
    public static void main(String[] args) {
        try{
            OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("C:\\Users\\10579\\Desktop\\out.txt"));
            osw.write("mircosoftibmfdhfih");
            System.out.println(osw.getEncoding());
            osw.close();
            osw=new OutputStreamWriter(new FileOutputStream("C:\\Users\\10579\\Desktop\\test.txt",true),"ISO8859_1");
            osw.write("djuifhdfhkjsdhfjkdshfkjds");
            System.out.println(osw.getEncoding());
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
