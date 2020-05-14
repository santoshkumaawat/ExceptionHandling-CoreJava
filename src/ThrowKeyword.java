
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();
        int div = 0;

        try {
            if (num2 > num1) {
                ArithmeticException ob = new ArithmeticException();
                throw ob;
            }
            div = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred");
        } catch (Exception e) {
            System.out.println("Something Wrong");
        }

        System.out.println("Division : " + div);
    }
}
