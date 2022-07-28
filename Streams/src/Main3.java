import java.io.*;

public class Main3 {

    public static void copyFile(String input, String output){

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] buffer = new byte[1024];
        int n = 0;

        try {
            fileInputStream = new FileInputStream(input);
            fileOutputStream = new FileOutputStream(output, false);
            while ((n = fileInputStream.read(buffer)) != -1) {
                System.out.println(n);
                fileOutputStream.write(buffer, 0, n);
            }
        } catch(IOException e){
            e.printStackTrace();
        }finally {
            closeStream(fileInputStream);
            closeStream(fileOutputStream);
        }
    }
    private static void closeStream(Closeable stream) {
        try{
            stream.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

       copyFile("resources/Imagem.jpg", "resources/copy.jpg");
       copyFile("resources/monma_fira.mp3", "resources/copy.mp3");
       copyFile("resources/joke", "resources/joke2");

    }
}
