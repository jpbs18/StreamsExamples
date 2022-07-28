import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("resources/list");
        FileOutputStream fileOutputStream = new FileOutputStream("resources/list2");

        int n = 0;
        n = fileInputStream.read();


       while((n = fileInputStream.read()) != -1){
            fileOutputStream.write(n);
            System.out.println(n);
       }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
