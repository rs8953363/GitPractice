package quizOne;

public class question16 {
    private static class Square {
        int num1, num2;
        public Square (int num1, int num2){
            this.num1 = num1 * num1;
            this.num2 = num2 * num2;
        }
    }

    public static void main(String[] args) {
        int num1 =4, num2 =8;
        Square square = new Square(num1, num2);
        square.num1 = 2;
        System.out.println(num1 + ":" +num2);
    }
}
