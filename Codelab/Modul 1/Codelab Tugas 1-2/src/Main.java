import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Login Type:");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            adminLogin(scanner);
        } else if (choice == 2) {
            studentLogin(scanner);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void adminLogin(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Replace "010" with the last 3 digits of your student ID
        if (username.equals("Admin010") && password.equals("Password010")) {
            System.out.println("Admin login successful!");
        } else {
            System.out.println("Login failed! Wrong username or password.");
        }
    }

    private static void studentLogin(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        // Replace "Ken Aryo Bimantoro" and "202310370311006" with your name and student ID
        if (name.equals("Ken Aryo Bimantoro") && studentID.equals("202310370311006")) {
            System.out.println("Student Login Successful!");
            System.out.println("Name: " + name);
            System.out.println("Student ID: " + studentID);
        } else {
            System.out.println("Login Failed! Wrong name or student ID.");
        }
    }
}
