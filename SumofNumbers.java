import java.util.Scanner;

class SumofNumbers {
    public static void main(String[] args) {
        System.out.println("Enter The Target");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum is : " + sum);
    }
}