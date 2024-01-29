import java.io.FileOutputStream;
import java.io.IOException;

public class Field {

    public static void writeField(int[] values) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("field.txt")) {
            for (int value : values) {
                // Записываем значение в виде 3 байтов
                fileOutputStream.write(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
