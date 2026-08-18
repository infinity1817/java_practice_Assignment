package Day_4_Assignment;

import java.io.*;

public class BufferedIO {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt")) ; BufferedWriter writer = new BufferedWriter(new FileWriter("error.txt"))){


            String line ;
            while ((line = reader.readLine()) != null){
                boolean tr = false;
                if(line.contains("error"))tr = true;
                if(tr){
                    writer.write(line);
                    System.out.println(line);
                }

            }
            writer.close();
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
