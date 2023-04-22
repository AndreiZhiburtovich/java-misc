/*
A simple Java console game.
You should guess a word, adding letters.
For example:
String word = "perfect";
 -------
 e
 -e--e--
 f
 -e-fe--
*/

import java.util.Scanner;

public class GuessAWord {

    public static String word = "perfect";
    public static int lengthWord = word.length();

    public static void main(String[] args) {

        char[] charsFromWord = word.toCharArray();
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a word");
        String maskWord = "-".repeat(lengthWord);
        System.out.println(maskWord);

        do {
            System.out.println("Input a letter:");
            char c = input.next().charAt(0);

            if (word.indexOf(c) >= 0) {
                System.out.println("OK! You have guessed one letter! Try another letter!");
                for (char elem : charsFromWord) {
                    if (elem == c) {
                        maskWord = replaceMaskLetter(c, maskWord);
                    }
                }
                System.out.println(maskWord);
            } else {
                System.out.println("Wrong, the word does not contain this letter! Try again!");
                System.out.println(maskWord);
            }
        } while (maskWord.contains("-"));
        System.out.println("Congratulation!!! You win!!!");
    }

    public static String replaceMaskLetter(char c, String maskWord) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lengthWord; i++) {
            if (word.charAt(i) == c) {
                stringBuilder.append(c);
            } else if (maskWord.charAt(i) != '-') {
                stringBuilder.append(maskWord.charAt(i));
            } else {
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }
}
