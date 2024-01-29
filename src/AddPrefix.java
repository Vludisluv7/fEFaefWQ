import java.io.File;

public class AddPrefix {

    public static void addPrefix(String[] filenames, String prefix) {
        for (String filename : filenames) {
            File file = new File(filename);

            if (file.isFile()) {
                String newName = prefix + file.getName();
                file.renameTo(new File(newName));
            }
        }
    }
}