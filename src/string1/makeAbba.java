/*Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns
"HiByeByeHi".
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
 */
package string1;

public class makeAbba {
    public static void main(String[] args) {
        String output=makeAbba("Hi", "Bye");
        System.out.println(output);
        String output1=makeAbba("Yo", "Alice");
        System.out.println(output1);
        String output2=makeAbba("What", "Up");
        System.out.println(output2);

    }
    public static String makeAbba(String str1, String str2){
        String result=str1+str2+str2+str1;
        return result;
    }
}
