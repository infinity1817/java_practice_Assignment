package Day_4_Assignment;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LogAnalyzer {

    public static void main(String[] args) {

        String filePath = "application.log";

        Path path = Paths.get(filePath);

        try (FileWriter writer = new FileWriter(filePath)) {

            writer.write("INFO Application started\n");
            writer.write("INFO User logged in\n");
            writer.write("WARNING Disk usage is high\n");
            writer.write("ERROR Database connection failed\n");
            writer.write("INFO Retrying connection\n");
            writer.write("ERROR Connection timeout\n");
            writer.write("INFO User logged out\n");
            writer.write("WARNING Memory usage is high\n");
            writer.write("ERROR Service unavailable\n");
            writer.write("INFO Application stopped\n");

            System.out.println("Log file created successfully.");

        } catch (IOException e) {
            System.out.println("Error creating log file: " + e.getMessage());
            return;
        }

        if (!Files.exists(path)) {
            System.out.println("Log file does not exist.");
            return;
        }

        int totalLines = 0;
        int infoCount = 0;
        int warningCount = 0;
        int errorCount = 0;

        String firstError = null;

        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String line;

            while ((line = reader.readLine()) != null) {

                totalLines++;

                if (line.startsWith("INFO")) {
                    infoCount++;
                }
                else if (line.startsWith("WARNING")) {
                    warningCount++;
                }
                else if (line.startsWith("ERROR")) {

                    errorCount++;


                    if (firstError == null) {
                        firstError = line.substring(5).trim();
                    }
                }
            }

        } catch (IOException e) {

            System.out.println("Error reading log file: " + e.getMessage());
            return;
        }



        System.out.println();
        System.out.println("Log Analysis Result");
        System.out.println("-------------------");

        System.out.println("Total lines " + totalLines);
        System.out.println("INFO " + infoCount);
        System.out.println("WARNING " + warningCount);
        System.out.println("ERROR " + errorCount);

        if (firstError != null) {
            System.out.println("First ERROR   : " + firstError);
        }
        else {
            System.out.println("First ERROR   : No ERROR entries found.");
        }
    }
}