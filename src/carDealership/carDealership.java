
package carDealership;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class carDealership {  //כבר יצרתי נתיבים אוטומטיים במחלקות עצמן, רק עכשיו אומרים ליצור ב-main?
    public static <T extends Comparable<T>> ArrayList<T> list_Sorter(ArrayList<T> not_Sorted_list){
        Collections.sort(not_Sorted_list);
        return not_Sorted_list;
    }

    public static void main(String[] args) {
        Path filePath = Paths.get(System.getProperty("user.dir"), "data", "input.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath), true));
            writer.write("");
        }
        catch (IOException e){
            throw new IllegalStateException("Failed to write to sales log.", e);
        }
    }
/*
    public static void main(String[] args) throws IOException {
        // Define the path to the file to be read
        Path filePath = Paths.get(System.getProperty("user.dir"), "data", "input.txt");


        // Define a string to write to file using a text block
        String text = """
        This is an example
        of using Files.write()
        and Files.writeString()
        to write to a file.
        """;

        // Write the string to file using the 'WRITE' option
        Files.write(filePath, text.getBytes());

        // Append the string to file using the 'APPEND' option
        Files.writeString(filePath, "\n", StandardOpenOption.APPEND);
        Files.writeString(filePath, "Additional text.",
                StandardOpenOption.APPEND);

        // Read the entire file as a byte array
        byte[] bytes = Files.readAllBytes(filePath);
        for (byte b : bytes)
        {
            System.out.print((char) b);
        }
        System.out.println("\n\n\n");

        // Read the entire file as a list of strings
        List<String> lines = Files.readAllLines(filePath);
        for (String line : lines)
        {
            System.out.println(line);
        }
        System.out.println("\n\n\n");

        // Read the entire file as a single string
        String content = Files.readString(filePath);
        System.out.println(content);
        System.out.println("\n\n\n");

        // split content to words
        String[] words = content.split("\\s+");
        for (String word : words)
        {
            System.out.println(word);
        }

    }
*/
}
