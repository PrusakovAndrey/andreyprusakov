import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;


public class fileWithLog {

    public static void main(String[] args) {
        // boolean pl = polindrome("123331");
        // System.out.println(pl);
        // File rootDir = new File("/");
        // String[] filesNumes = processFilesFromFolder(rootDir);
        // System.out.println(Arrays.toString(filesNumes));

        customFileWriter("/zsdgdhtyt");

    }

    private static boolean polindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }

        return true;
    }

    // Напишите метод, который вернет содержимое текущей папки в виде массива строк.
    // Напишите метод, который запишет массив, возвращенный предыдущим методом в
    // файл.
    // Обработайте ошибки с помощью try-catch конструкции. В случае возникновения
    // исключения, оно должно записаться в лог-файл.

    private static String[] processFilesFromFolder(File folder) {
        File[] folderEntries = folder.listFiles();
        String[] filesNames = new String[folderEntries.length];

        for (int i = 0; i < filesNames.length; i++) {
            filesNames[i] = folderEntries[i].getName();
        }

        return filesNames;

    }

    private static void customFileWriter(String pathFolder) {
        File rootDir = new File(pathFolder);
        try (FileWriter writer = new FileWriter("notes3.txt", false)) {
            String[] fileNames = processFilesFromFolder(rootDir);
            for (int i = 0; i < fileNames.length; i++) {
                writer.write(fileNames[i]);
                writer.write("\n");
                writer.flush();
            }

        } catch (IOException ex) {
            Logger logger = Logger.getLogger("task2");
            logger.log(Level.SEVERE, ex.getMessage());

            System.out.println(ex.getMessage());
        } catch (NullPointerException ex) {
            Logger logger = Logger.getLogger("task2");
            try {
                FileHandler handler = new FileHandler("severe.log");
                logger.addHandler(handler);

                logger.log(Level.SEVERE, ex.getMessage());

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println(ex.getMessage());
        }

    }

}


