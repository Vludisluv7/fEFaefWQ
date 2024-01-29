import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Backup {

    public static void createBackup(String directory) {
        File sourceDir = new File(directory);
        File backupDir = new File("./backup");

        // Создаем новую директорию для резервной копии
        backupDir.mkdir();

        if (sourceDir.isDirectory()) {
            File[] files = sourceDir.listFiles();

            for (File file : files) {
                if (file.isFile()) {
                    try {
                        // Копируем файл в новую директорию с заменой, если файл уже существует
                        Files.copy(file.toPath(), backupDir.toPath().resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}