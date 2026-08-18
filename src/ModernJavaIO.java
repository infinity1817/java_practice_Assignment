package Day_4_Assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ModernJavaIO {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("input.txt");
        Files.writeString(path,"Name:Nimish\nAge 21\nCompany SOTI");
        String content = Files.readString(path);
        System.out.println(content);
        System.out.println(Files.exists(path));
        System.out.println(Files.size(path));

        List<String> lines = Files.readAllLines(path);

        int cnt =0 ;
        for(String line : lines){
            if(line.contains("error")){cnt++;}
        }
        System.out.println(cnt);
// Handle missing files
        try{
            String name = Files.readString(path);
            System.out.println(name);
        }
        catch(IOException e){
            System.out.println("File Not Found");
        }


    }
}


// Read all lines is undesirable for large files because it loads the whole file in memory at once and if we don't have enough space jvm throws error .