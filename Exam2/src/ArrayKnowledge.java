import java.util.Scanner;
public class ArrayKnowledge {
    public static void main(String[] args) {
        System.out.println("Sentence Strecher");
        Scanner sentence = new Scanner(System.in);
        System.out.print("Enter a sentence:   ");
        String input = sentence.nextLine();

        char[] charArray = stringToArray(input);
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        sentence.close();
    }
    public static char[] stringToArray(String input) {
        char[] charArray = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            charArray[i] = input.charAt(i);
        }
        return charArray;
    }}