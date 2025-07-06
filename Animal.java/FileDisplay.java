import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplay {
    public static void main(String[] args) {
        String fileName = "example.txt"; // Make sure this file exists in your project directory

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
