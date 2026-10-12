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
            System.out.println("What you want to Do?");

            System.out.println("1) Booking a car");
            System.out.println("2) Check the information");
            System.out.println("3) Cancel Booking");

            System.out.print("Enter what you want  = ");
            try {

                int user_choose = input.nextInt();

                if (user_choose == 1) {

                    System.out.println("1) Honda");
                    System.out.println("2) Toyota");
                    System.out.println("3) Mazda");
                    System.out.println("4) Nissan");
                    

                    while (status) {
                        try {
                            System.out.print("Which one do you wanna choose = ");
                            int selected = input.nextInt();
                            if (selected < 1 || selected > 4) {
                                System.out.println("please answer in the choice ");

                            } else {
                                status = false;
                                if(selected == 1) {
                                    Honda myHondaShop = new Honda();
                                    myHondaShop.displayHondaCars();
                                    int user_selected_car = input.nextInt();
                            } 
                            else if(selected == 2) {

                                    Toyota myToyota = new Toyota();
                                    myToyota.displayHondaCars();
                            
                             } 
                            else if(selected == 3) {

                                    Mazda myMazda = new Mazda();
                                    myMazda.displayHondaCars();
                            }
                            else if(selected == 4) {

                                Nissan myNissan = new Nissan();
                                myNissan.displayHondaCars();
                            }

                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Your answer is invalid");

                            input.next();
                        }
                    }

                } else if (user_choose == 2) {
                    status = false;
                    // เขียนฟังชั่นดูข้อมูล
                } else if(user_choose == 3) {
                    status = false;
                }
            } catch (InputMismatchException e) {

                System.out.println("**********************");
                System.out.println("Your type is invalid !");
                System.out.println("**********************");

                input.next();
            }
        }

    input.close();
}}

// git add .
// git commit -m " ข้อความ"
// git push -u origin main