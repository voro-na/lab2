import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите путь к файлу на локальном диске\n");

        Scanner in = new Scanner(System.in);
        String str;
        str = in.nextLine();
        ReadWriteFile readWriteFile = new ReadWriteFile();
        while (true) {
            try {
                readWriteFile.ReadFile(str);
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Введите путь к файлу на локальном диске\n");
                str = in.nextLine();
            }
        }
        System.out.println("Введите путь к файлу на локальном диске для записи результата\n");
        str = in.nextLine();
        while (true) {
            try {
                readWriteFile.WriteFile(str);
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Введите путь к файлу на локальном диске\n");
                str = in.nextLine();
            }
        }
    }
}
