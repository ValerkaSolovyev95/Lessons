import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class FinderFiles {
    private static int countFiles = 0;
    private static int countFolders = 0;

    public static void readFolder(String pathToFile){
        File dir = new File(pathToFile);
        if (dir.isFile()) {
            countFiles += 1;
        } else {
            if (dir.isDirectory()){
                countFolders += 1;
                for (File file: Objects.requireNonNull(dir.listFiles())
                     ) { readFolder(String.valueOf(file));
                }
            }
        }



    }

    public static void main(String[] args) {
        String path = "src";
        System.out.println("Путь | " + path);
        readFolder(path);
        System.out.println("Количество файлов | " + countFiles);
        System.out.println("Количество папок | " + countFolders);

    }
}
