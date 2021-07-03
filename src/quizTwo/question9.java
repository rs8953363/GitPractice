package quizTwo;

public class question9 {

        public static void main(String[] args) {
            String numbers= "1 ";
            numbers=numbers.concat("2 ");
            String number2= "3 ";
            numbers=numbers.concat(number2);
            numbers.replace('2', '3');
            number2=numbers.concat(number2);
            System.out.println(numbers);
        }
    }

