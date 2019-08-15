package immutablestring;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author adittachakraborty
 */
public class ImmutableString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get("data");

        try {
            Path newDir = Files.createDirectory(path);
        } catch (FileAlreadyExistsException e) {
            // the directory already exists.
        } catch (IOException e) {
            //something else went wrong
            e.printStackTrace();
        }

//        String s = "Sachin";
//        s.concat(" Tendulkar"); //concat() method appends the string at the end
//        System.out.println(s);
//        
//        System.out.println();
//        
//        s = s.concat(" Tendulkar"); //still sachin object is not modified.
//        System.out.println(s);
    }

}
