import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static boolean writeFile(String[] dataArr) {
        try (FileWriter writer = new FileWriter(dataArr[0], true)) {
            for (String s : dataArr) {
                writer.write("<" + s + ">");
            }
            writer.append('\n');
            writer.flush();
            writer.close();
            return true;
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
