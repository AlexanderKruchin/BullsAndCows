import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReaderOnFile {
    public static int readerOnfile() throws FileNotFoundException {
        FileReader reader = new FileReader("ЛогиИгрыБыкиИКоровы.txt");
        Scanner scanner = new Scanner(reader);
        int number = 1;
        String numberGameOnFile = null;
        while(scanner.hasNext()) {
           numberGameOnFile = scanner.nextLine().substring(6,7);

        if (numberGameOnFile.equals(":") || numberGameOnFile.equals(" ")){

        }else {
            number = Integer.parseInt(numberGameOnFile);
            }
        }
        return number;
    }
}
