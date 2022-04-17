import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        int t;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        t = input.nextInt();
        if ( t >- 5) {
            System.out.println("Warlmly");
        } else if ( -5 <= t || t < - 20) {
            System.out.println("Normally");
        } else if ( -20 >= t) {
            System.out.println("Cold");
        } else {
            System.out.println("Invalid input");
        }
    }
}
