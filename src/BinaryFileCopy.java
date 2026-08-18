package Day_4_Assignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileCopy {

    public static void main(String[] args) throws IOException {

        FileInputStream input =
                new FileInputStream("input.jpg");

        FileOutputStream output =
                new FileOutputStream("output.jpg");

        byte[] buffer = new byte[1024];

        int bytesRead;

        while ((bytesRead = input.read(buffer)) != -1) {
            output.write(buffer, 0, bytesRead);
        }

        input.close();
        output.close();

        System.out.println("Image copied ");
    }
}
