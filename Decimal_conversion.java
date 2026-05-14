import java.util.Scanner;

public class DecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        
        int n = num;
        String binary = "";
        String octal = "";
        String hex = "";

        // Binary conversion
        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }

        // Reset n
        n = num;

        // Octal conversion
        while (n > 0) {
            int remainder = n % 8;
            octal = remainder + octal;
            n = n / 8;
        }

        // Reset n again
        n = num;

        // Hexadecimal conversion
        while (n > 0) {
            int remainder = n % 16;

            if (remainder < 10) {
                hex = remainder + hex;
            } else {
                hex = (char)(remainder - 10 + 'A') + hex;
            }

            n = n / 16;
        }

        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);

        sc.close();
    }
}
