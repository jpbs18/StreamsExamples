import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("resources/letter");
        FileOutputStream fileOutputStream = new FileOutputStream("resources/letter2");

        byte[] buffer = new byte[1024];
        int n = fileInputStream.read(buffer);

        for(int i= 0; i < n; i++){
           fileOutputStream.write(buffer[i]);
        }

        fileInputStream.close();
        fileOutputStream.close();

    }
}
