package IO;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) {
        FileWriter fw=null;
        try{
            fw=new FileWriter("C:\\Users\\10579\\Desktop\\out.txt");
            for(int c=0;c<=2000;c++){
                fw.write(c);

            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件读写错误");
            System.exit(-1);

        }

    }
}
