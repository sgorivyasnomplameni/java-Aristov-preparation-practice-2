import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileWriting {

    public static void main(String[] args) {
        File document = new File("index.html");

        try {
            String title = "Заголовок страницы";
            FileWriter fw = new FileWriter(document);
            fw.write("<HTML>" + System.lineSeparator()); // использование System.lineSeparator()
            fw.write("<HEAD>" + System.lineSeparator());
            fw.write("<TITLE>" + title + "</TITLE>" + System.lineSeparator());
            fw.write("</HEAD>" + System.lineSeparator());
            fw.write("</HTML>");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileWriting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
