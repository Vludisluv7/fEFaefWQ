import java.util.Arrays;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) {
        // 1) Создание резервной копии файлов в директории
        Backup.createBackup("directory_path");

        // 2) Запись состояния ячеек поля в файл
        int[] field = {1, 2, 3, 1, 2, 0, 0, 0, 0};
        Field.writeField(field);

        // 3) Добавление префикса к набору файлов
        String[] filenames = {"file1.txt", "file2.txt", "file3.txt"};
        AddPrefix.addPrefix(filenames, "prefix_");
    }
}
