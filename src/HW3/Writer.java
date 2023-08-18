package HW3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void writerHumanInfo(Human h){
        String fileName = h.getFirstName();
        File file = new File(fileName + ".txt");
        try(FileWriter writer = new FileWriter(fileName + ".txt", file.exists())){
            writer.write(h.toString() + "/n");
        }catch (IOException e) {
            System.out.println("Ошибка записи в файл " + e.getMessage());
            e.printStackTrace(); 
        }

    }
}
