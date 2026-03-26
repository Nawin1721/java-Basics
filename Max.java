import java.util.Scanner;

class Max {
    public static void main(String[] args) {
        // System.out.println("Enter The Two Numbers : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of A :");
        int a = sc.nextInt();
        System.out.println("Enter The Value of B :");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " IS THE MAXIMUM NUMBER");
        } else {
            System.out.println(b + " IS THE MAXIMUM NUMBER");
        }

    }

}