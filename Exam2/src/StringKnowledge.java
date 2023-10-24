import java.util.Scanner;

public class StringKnowledge {
    public static void main(String[] args) {
        System.out.println("Repeat Finder");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text to test:   ");
        String toTest = input.nextLine();

        boolean result = findRepeats(toTest);
        System.out.println(result);
        input.close();
    }

    public static boolean findRepeats(String toTest) {
        for (int len = 2; len <= toTest.length(); len++) {
            for (int i = 0; i <= toTest.length() - len; i++) {
                String substring = toTest.substring(i, i + len);
                if (toTest.indexOf(substring, i + 1) != -1) {
                    return true;
                }
            }
        }
        return false;
        // Had to reformat this (-2)
    }
}