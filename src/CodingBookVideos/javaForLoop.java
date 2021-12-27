package CodingBookVideos;

import java.util.Scanner;

public class javaForLoop {
    //Print first 10 naturaal numbers using a for loop
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


    //Accept a number from user and calculate the sum of
    // all number between 1 and the accepted number
    int sum=0;
    Scanner scan= new Scanner(System.in);
    System.out.println("Please enter a number: ");
    int num= scan.nextInt();
    for(int i=1; i<=num; i++){
        sum=sum+1;
    }
        System.out.println(sum);

    /*Ask a user to guess a number that you initialized. If user guesses wrong, print: You guessed wrong
    If they guess right, print: YOu gueessed right
    The user should only get 3 tries.
     */
        int myNumber=5;
        Scanner scan1= new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Please guess a number: ");
            int number=scan1.nextInt();
            if (myNumber==number) {
                System.out.println("You guessed right");
                break;
            }else
                System.out.println("You guessed wrong");
        }

        //Given an arry int[] intArray=new int[]{1,2,3,4,5}
        // Using for loop, find the number of even and odd numbers
        int[] intArray=new int[]{1,2,3,4,5};
        int evenCount=0;
        int oddCount=0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]%2==0)
                evenCount++;
            else
                oddCount++;
            System.out.println("Even numbers " +evenCount);
            System.out.println("Odd numbers " +oddCount);
        }
    }

}
