import java.util.Scanner;

public class Voting {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        int a = 0, b = 0, c = 0, vote;

        System.out.print("Enter the number of voters = ");
        int n = SC.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Vote (1-A, 2-B, 3-C):");
            vote = SC.nextInt();

            if (vote == 1) {
                a++;
            } else if (vote == 2) {
                b++;
            } else if (vote == 3) {
                c++;
            } else {
                System.out.println("Invalid Vote");
            }
        }

        System.out.println("A: " + a + " B: " + b + " C: " + c);

        if (a > b && a > c) {
            System.out.println("Winner: A");
        } else if (b > a && b > c) {
            System.out.println("Winner: B");
        } else if (c > a && c > b) {
            System.out.println("Winner: C");
        } else {
            System.out.println("Tie");
        }

        SC.close();
    }
}
