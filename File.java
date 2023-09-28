import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class File {
    public static boolean writeFile(String[] dataArr) {
        try (FileWriter writer = new FileWriter(dataArr[0], true)) {
            for (String s : dataArr) {
                writer.write("<" + s + ">");
            }
            writer.append('\n');
            writer.flush();
            return true;
        }
        catch(IOException e) {
            System.out.println("Ошибка!");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            return false;
        }
    }
}