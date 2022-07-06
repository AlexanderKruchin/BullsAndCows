public class CreateNumber {
    public static String[] createNumber() {

            String[] computerNumber = new String[4];

            int numberOne = (int) (Math.random() * 10);
            computerNumber[0] = String.valueOf(numberOne);

            int numberTwo = (int) (Math.random() * 10);
            int numberThree = (int) (Math.random() * 10);
            int numberFour = (int) (Math.random() * 10);


            if (numberTwo == numberOne) {
                while (numberTwo == numberOne){
                    numberTwo = (int) (Math.random() * 10);
                    computerNumber[1] = String.valueOf(numberTwo);
                }
            } else computerNumber[1] = String.valueOf(numberTwo);


            if (numberThree == numberOne || numberThree == numberTwo) {
                while (numberThree == numberOne || numberThree == numberTwo){
                    numberThree = (int) (Math.random() * 10);
                    computerNumber[2] = String.valueOf(numberThree);
                }
            } else computerNumber[2] = String.valueOf(numberThree);


            if (numberFour == numberOne || numberFour == numberTwo || numberFour == numberThree) {
                while (numberFour == numberOne || numberFour == numberTwo || numberFour == numberThree){
                    numberFour = (int) (Math.random() * 10);
                    computerNumber[3] = String.valueOf(numberFour);
                }
            } else computerNumber[3] = String.valueOf(numberFour);

            return computerNumber;
    }
}
