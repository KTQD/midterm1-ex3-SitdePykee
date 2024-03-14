import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
        String line;
        while ((line = reader.readLine()) != null){
            line = line.replaceAll("Nha Trang", "Vũng Tàu");
            writer.println(line);

        }
    }
}
