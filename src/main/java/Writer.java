import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    /**Метод по созданию файла*/
    public static void createFail(String nameFile){
        try{File file = new File(nameFile);
            if (file.createNewFile()){
                System.out.println("Фаил создается");
                System.out.println("Фаил создан");}
            else {
                System.out.println("Фаил уже создан");
            }
        }catch (IOException exception){
            System.out.println("Фаил не создан");
        }
    }
    /** Данный метод принимает на вход строковое название файла
     * и записывает в него данные переданные в функцию */
    public static void fileWriter(String file, String textToWrite) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(textToWrite);
        System.out.println("Текст Записан");
        writer.close();
    }
    /** Данный метод принимает на вход строковое название файла
     * и записывает в него данные с терминала */
    public static void fileWriterWithKeyword(String file) throws IOException {
        FileWriter writer = new FileWriter(file);
        System.out.println("Введите текст для записи");
        Scanner scanner = new Scanner(System.in);
        writer.write(scanner.next());
        System.out.println("Текст Записан");
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        createFail("example.txt");
        fileWriter("example.txt", "Hello word");
        createFail("new.txt");
        fileWriterWithKeyword("new.txt");


    }
}
