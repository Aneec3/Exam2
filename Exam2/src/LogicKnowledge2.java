import java.util.Scanner;

public class LogicKnowledge2 {
    public static void main(String[] args) {
        System.out.println("Small Chocolates Calculator");
        Scanner chocolates = new Scanner(System.in);
        System.out.print("Small chocolate bars: ");
        int small = chocolates.nextInt();
        System.out.print("Large chocolate bars: ");
        int large = chocolates.nextInt();
        System.out.print("Goal pounds to sell:  ");
        int goal = chocolates.nextInt();

        int result = makeChocolate(small, large, goal);
        System.out.println("Small bars to use:  " + result);
        chocolates.close();
    }

    // This is supposed to be inside the same class as the other logic knowledge method (-2)
    public static int makeChocolate(int small, int large, int goal) {
        int AllLargeBars = goal / 5;
        if (large >= AllLargeBars) {
            goal -= AllLargeBars * 5;
        } else {
            goal -= large * 5;
        }
        if (goal <= small) {
            return goal;
        } else return -1;
        // Had to reformat this (-2)
    }
}