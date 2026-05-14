import java.util.Scanner;

class Student {

    private String name;
    private int rollNo;
    private int totalClasses;
    private int attendedClasses;

    public Student(String name, int rollNo, int totalClasses, int attendedClasses) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    public double calculatePercentage() {
        if (totalClasses == 0)
            return 0;

        return ((double) attendedClasses / totalClasses) * 100;
    }

    public void displayRecord() {

        System.out.printf("%-10d %-15s %-15d %-15d %.2f%%\n",
                rollNo, name, totalClasses, attendedClasses,
                calculatePercentage());
    }
}

public class AttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Roll No: ");
            int roll = sc.nextInt();

            System.out.print("Total Classes: ");
            int total = sc.nextInt();

            System.out.print("Attended Classes: ");
            int attended = sc.nextInt();

            students[i] = new Student(name, roll, total, attended);
        }

        System.out.println("\nAttendance Report");

        System.out.printf("%-10s %-15s %-15s %-15s %-10s\n",
                "RollNo", "Name", "Total", "Attended", "Percentage");

        for (Student s : students) {
            s.displayRecord();
        }

        sc.close();
    }
}
