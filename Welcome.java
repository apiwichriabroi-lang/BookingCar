import java.util.InputMismatchException;
import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean status = true;

        System.out.println("********************************");
        System.out.println("Welcome to Booking Car Program");
        System.out.println("********************************");

        while (status) {
            System.out.print("What you want to Do?");

            System.out.println("1) Booking a car");
            System.out.println("2) Check the information");

            System.out.print("Enter what you want 1 or 2 = ");
            try {

                int user_choose = input.nextInt();
                if (user_choose == 1) {
                    status = false;
                    // เขียนฟังชั่นตรงนี้จองรถตรงนี้
                } else if (user_choose == 2) {
                    status = false;
                    // เขียนฟังชั่นดูข้อมูล
                }
            } catch (InputMismatchException e) {

                System.out.println("**********************");
                System.out.println("Your type is invalid !");
                System.out.println("**********************");

                input.next();
            }
        }

        input.close();
    }
}