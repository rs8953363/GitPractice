package quizTwo;

public class question8 {
    public static void main(String[] args) {
        String numbers= "1 ";
        numbers.concat("2 ");
        String number2= "3 ";
        numbers.concat(number2);
        numbers.replace('2', '3');
        numbers.concat(number2);
        System.out.println(numbers);
    }
}
