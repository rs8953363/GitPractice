package quizOne;

import java.util.Scanner;

public class question17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fullName = in.nextLine();
        System.out.println(getOutputString(fullName));
    }

    private static String getOutputString(String fullName) {
        String [] namePair = fullName.split(" ");
        StringBuilder sb = new StringBuilder("Hello " + namePair[0]);
        sb.append(" ");
        for(int i = 0; i < namePair[0].length(); i++) {
            sb.append("X");
        }
        return sb.toString();
    }

}