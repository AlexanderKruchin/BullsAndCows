public class MessageForUser {
    public static String messageForUser(int bulls, int cows){
        String bullString ;
        String cowString ;

        if (bulls>=2){
            bullString = " Быка ";
        }else if (bulls == 1){
            bullString = " Бык ";
        }else bullString = " Быков";
        if (cows>=2){
            cowString = " Коровы ";
        }else if (cows == 1){
            cowString = " Корова ";
        }else cowString = " Коров ";

        String answer = cows + cowString + bulls + bullString;

        return answer ;
    }
}
