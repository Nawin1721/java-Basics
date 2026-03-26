import java.util.Scanner;

class Udetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age : ");
        int age = sc.nextInt();
        sc.nextLine(); // REMOVES ENTER (\n) or READS A STRING
        System.out.println("Enter The Name : ");
        String name = sc.nextLine();

        System.out.println("Age : " + age);
        System.out.println("Name : " + name);
        sc.close();
    }
}