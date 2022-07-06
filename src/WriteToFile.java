import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteToFile {

    public static void writeToFile(int gameNum, int countAtt, String lineUser, String computerNumber, String mesForUser, boolean winOrLose) throws IOException {

        Date dated = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        if (countAtt == 1 & winOrLose) {
            FileWriter fileWriter = new FileWriter("ЛогиИгрыБыкиИКоровы.txt", true);
            fileWriter.write("Game №" + gameNum +" "+ simpleDateFormat.format(dated) + " Загаданная строка " + computerNumber + " \n");
            fileWriter.write("Запрос: " + lineUser + " Ответ: " + mesForUser + " \n");
            fileWriter.write("Строка была угадана за " + countAtt + " попытку.\n");
            fileWriter.flush();
            fileWriter.close();
        }
        if (countAtt == 1 & !winOrLose){
            FileWriter fileWriter = new FileWriter("ЛогиИгрыБыкиИКоровы.txt", true);
            fileWriter.write("Game №" + gameNum +" "+ simpleDateFormat.format(dated) + " Загаданная строка " + computerNumber + " \n");
            fileWriter.write("Запрос: " + lineUser + " Ответ: " + mesForUser + " \n");
            fileWriter.flush();
            fileWriter.close();
        }
        if (countAtt > 1 & !winOrLose){
            FileWriter fileWriter = new FileWriter("ЛогиИгрыБыкиИКоровы.txt", true);
            fileWriter.write("Запрос: " + lineUser + " Ответ: " + mesForUser + " \n");
            fileWriter.flush();
            fileWriter.close();
        }else if (countAtt > 1 & winOrLose){
            FileWriter fileWriter = new FileWriter("ЛогиИгрыБыкиИКоровы.txt", true);
            fileWriter.write("Запрос: " + lineUser + " Ответ: " + mesForUser + " \n");
            fileWriter.write("Строка была угадана за " + countAtt + " попытку. \n");
            fileWriter.flush();
            fileWriter.close();
        }

    }
}
