import java.util.Scanner;
public class RecursionDemo {
static int factorial(int n) {
if (n == 0)
return 1;
else
return n * factorial(n - 1);
}
static int fibonacci(int n) {
if (n == 0)
return 0;
else if (n == 1)
return 1;
else
return fibonacci(n - 1) + fibonacci(n - 2);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number for factorial: ");
int num = sc.nextInt();
System.out.println("Factorial = " + factorial(num));
System.out.print("Enter number of Fibonacci terms: ");
int terms = sc.nextInt();
System.out.print("Fibonacci Series of" + terms +" are : ");
for (int i = 0; i < terms; i++) {
System.out.print(fibonacci(i) + " ");
}
sc.close();
}
}
