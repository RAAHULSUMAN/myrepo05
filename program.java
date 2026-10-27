import java.util.Scanner;

class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        long remaining = Math.abs((long) number);
        long reversed = 0;

        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }

        if (number < 0) {
            reversed = -reversed;
        }

        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}