import java.util.Scanner;

public class P02AddTwoNumbers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());

        int sum = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, sum);
    }
}
