import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) {
        File f=new File("E:\\JAVA\\JAVA PRG 3 IMP\\demo.text");
        boolean res = false;
    try{
        res=f.createNewFile();
    }
    catch(IOException e){
        e.printStackTrace();
    }
    System.out.println(res);
    }
}
