import java.util.InputMismatchException;
import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        boolean status = true; // เซ็ตเพื่อให้โปรแกรมทำงานได้เรื่อยๆตอนuserใส่ อย่างอื่นนอกจากข้อกความ

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
                    // เขียนฟังชั่นจองรถตรงนี้ ถ้าผู้ใช้เลือกจอง ให้แสดงว่ารถรุ่นนี้มีอะไรบ้างและให้เก็บค่าไว้ด้วยว่าผู้ใช้เลือกอะไร จากนั้นเมื่อเลือกเสร็จให้เลือกเวลาต่อว่าผู้ใช้จะจองเวลาไหนแล้วก็ เก็บค่าไว้ด้วย

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