import java.util.Scanner;

class Mul {
    public static void main(String[] args) {
        System.out.println("Enter The Selected Table : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        sc.close();
    }
}