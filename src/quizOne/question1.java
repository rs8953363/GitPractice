package quizOne;

import java.util.Arrays;

public class question1 {
        public static void main(String[] args) {
            int[][] numbers=new int[2][2];
            for (int row = 0; row <numbers.length ; row++) {
                for (int column = 1; column <numbers.length ; column++) {
                    numbers[row][column]=86;
                }
            }
            for (int row = 0; row < numbers.length; row++) {
                Arrays.stream(numbers[row]).filter(i->i%2==0).forEach(System.out::print);

            }
        }
    }

