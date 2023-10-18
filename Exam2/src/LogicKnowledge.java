import java.util.Scanner;
public class LogicKnowledge {
    public static void main(String[] args) {
        System.out.println("Lottery Number Checker");
        Scanner numbers = new Scanner(System.in);
        System.out.print("Enter the first number:   ");
        int a = numbers.nextInt();
        System.out.print("Enter the second number:  ");
        int b = numbers.nextInt();
        System.out.print("Enter the third number:   ");
        int c = numbers.nextInt();

        int result = greenTicket(a, b, c);
        System.out.println(result);
        numbers.close();
    }
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }}}