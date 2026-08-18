package Day_4_Assignment;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopy {

    public  void main(String[] args) throws IOException {

        File file = new File("input.txt");

        FileWriter writer = new FileWriter("input.txt");

        writer.write("hii this is Nimish Yadav, I'm 21 years old");
        writer.close();

        FileWriter writer2 = new FileWriter("output.txt");
        FileReader reader = new FileReader(file);

        try {
            int data;

            while ((data = reader.read()) != -1) {
                writer2.write(data);
                System.out.print((char) data);
            }

            reader.close();
            writer2.close();

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}