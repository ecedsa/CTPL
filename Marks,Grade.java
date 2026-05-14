import java.util.Scanner;
class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for CS: ");
        float m1 = sc.nextFloat();
        System.out.print("Enter marks for SS: ");
        float m2 = sc.nextFloat();
        System.out.print("Enter marks for OOP: ");
        float m3 = sc.nextFloat();
        System.out.print("Enter marks for AIML: ");
        float m4 = sc.nextFloat();
        System.out.print("Enter marks for PM: ");
        float m5 = sc.nextFloat();
        float total = m1 + m2 + m3 + m4 + m5;
        System.out.println("Total Marks out of 500 are: " + total);
        float avg = total / 5;
        System.out.println("Average marks: " + avg);
        float per = (total / 500) * 100;
        System.out.println("Percentage is: " + per);
        String grade;
        if (per >= 90) {
            grade = "O";
        }
        else if (per >= 80) {
            grade = "A+";
        }
        else if (per >= 60) {
            grade = "A";
        }
        else if (per >= 50) {
            grade = "B+";
        }
        else if (per >= 35) {
            grade = "B";
        }
        else {
            grade = "Fail";
        }
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
