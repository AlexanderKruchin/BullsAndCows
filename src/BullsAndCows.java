
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) throws IOException {

            String[] computerNumber = CreateNumber.createNumber(); //цифра придуманная компьютером
            System.out.println("Компьютер загадал число. Игра началась!");
            int countAttempts = 0; //количество попыток

            int gameNumber;

            try {
                gameNumber = ReaderOnFile.readerOnfile()+1; //номер игры
            }catch (FileNotFoundException e){
                 gameNumber = 1;
            }

            while (true) {
                String compNumber = String.valueOf(new StringBuilder(computerNumber[0] + computerNumber[1] + computerNumber[2] + computerNumber[3]));


                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                if (line.length()<4){
                    line = "Ошибка";

                }

                if (line.equals("стоп")) {
                    countAttempts = 0;
                    System.exit(1);
                } else if (line.equals("продолжить")) {
                    gameNumber++;
                    countAttempts = 0;
                    computerNumber = CreateNumber.createNumber();
                    System.out.println("Компьютер загадал число. Игра началась!");
                    continue;
                } else countAttempts++;
                if (line.equals("ответ")){
                    countAttempts = countAttempts-1;
                    System.out.println(compNumber);
                    continue;
                }
                if (line.equals("Ошибка")){
                    countAttempts = countAttempts-1;
                    System.out.println("Вы ввели мало знаков. Введите больше знаков");
                    continue;
                }

                    String[] listUserNumbers = new String[4];
                    listUserNumbers[0] = line.substring(0, 1);
                    listUserNumbers[1] = line.substring(1, 2);
                    listUserNumbers[2] = line.substring(2, 3);
                    listUserNumbers[3] = line.substring(3, 4);

                int bulls = 0;
                int cow = 0;


                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (computerNumber[i].equals(listUserNumbers[j]) && i == j) {
                            bulls++;
                        }
                        if (computerNumber[i].equals(listUserNumbers[j]) && i != j) {
                            cow++;
                        }

                    }

                }
                boolean winOrLose; // отметка победил уже или нет пользователь
                if (bulls == 4){
                    System.out.println("Вы угадали число! " +
                            "\n Если хотите начать заного напишите 'продолжить' " +
                            "\n Если хотите закончить напишите 'стоп'");
                    winOrLose = true;
                }else winOrLose = false;

                String mesForUser = MessageForUser.messageForUser(bulls, cow);//сообщение юзеру о количестве быков и коров
                System.out.println(mesForUser);
                WriteToFile.writeToFile(gameNumber,countAttempts,line,compNumber,mesForUser,winOrLose);
            }
    }
}
