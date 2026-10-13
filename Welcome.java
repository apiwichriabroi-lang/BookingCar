import java.util.InputMismatchException;
import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Userinfo userinfo = new Userinfo();
        Total bill = new Total();
        boolean status = true; // เซ็ตเพื่อให้โปรแกรมทำงานได้เรื่อยๆตอนuserใส่ อย่างอื่นนอกจากข้อกความ

        System.out.println("********************************");
        System.out.println("Welcome to Booking Car Program");
        System.out.println("********************************");

        while (status) {
            System.out.println("What you want to Do?");

            System.out.println("1) Booking a car");
            System.out.println("2) Check the information");
            System.out.println("3) Cancel Booking");

            try {
                System.out.print("Enter what you want  = ");
                int user_choose = input.nextInt();

                if (user_choose == 1) {
                    int period = 0;
                    boolean period_status = true;
                    while (period_status) {
                        try {
                            System.out.print("Please enter period of day that you wanna rent = ");
                            period = input.nextInt();
                            if (period < 1) {
                                System.out.println("**********************");
                                System.out.println("Cannot be negative or zero");
                                System.out.println("**********************");

                                continue;
                            }

                            period_status = false;

                        } catch (InputMismatchException e) {
                            System.out.println("***************************");
                            System.out.println("Please enter with number!");
                            System.out.println("***************************");
                            input.next();
                        }
                    }

                    userinfo.setPeriod(period);

                    System.out.println("1) Honda");
                    System.out.println("2) Toyota");
                    System.out.println("3) Mazda");
                    System.out.println("4) Nissan");

                    boolean select_brand_status = true;
                    while (select_brand_status) {
                        try {
                            System.out.print("Which one do you wanna choose = ");
                            int selected = input.nextInt();
                            if (selected < 1 || selected > 4) {
                                System.out.println("please answer in the choice ");

                            } else {
                                select_brand_status = false;
                                if (selected == 1) {
                                    boolean status_select_car = true;
                                    while (status_select_car) {
                                        Honda myHondaShop = new Honda();
                                        myHondaShop.displayHondaCars();
                                        try {
                                            System.out.print("Which car you that you want? = ");
                                            int user_selected_car = input.nextInt();

                                            if (user_selected_car < 1 || user_selected_car > 6) {
                                                System.out.println("Please enter 1-6!");
                                            } else if (user_selected_car == 1) {
                                                userinfo.setName_Price("Honda nsx", 1100);
                                                bill.setTotal(1100, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 2) {
                                                userinfo.setName_Price("Honda Civic", 1900);
                                                bill.setTotal(1900, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 3) {
                                                userinfo.setName_Price("Honda Accord", 2800);
                                                bill.setTotal(2800, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 4) {
                                                userinfo.setName_Price("Honda CR-V", 2500);
                                                bill.setTotal(2500, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 5) {
                                                userinfo.setName_Price("Honda HR-V", 1600);
                                                bill.setTotal(1600, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 6) {
                                                userinfo.setName_Price("Honda City", 1200);
                                                bill.setTotal(1200, period);
                                                status_select_car = false;
                                            }

                                        } catch (InputMismatchException e) {
                                            System.out.println("********************");
                                            System.out.println("Your select is invalid!");
                                            System.out.println("********************");

                                            input.next();
                                        }

                                    }
                                } else if (selected == 2) {
                                    boolean status_select_car = true;
                                    while (status_select_car) {

                                        try {
                                            Toyota myToyota = new Toyota();
                                            myToyota.displayToyotaCars();
                                            System.out.print("Which car you that you want? = ");
                                            int user_selected_car = input.nextInt();

                                            if (user_selected_car < 1 || user_selected_car > 5) {
                                                System.out.println("Please enter 1-5!");
                                            } else if (user_selected_car == 1) {
                                                userinfo.setName_Price("Toyota Camry", 2800);
                                                bill.setTotal(2800, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 2) {
                                                userinfo.setName_Price("Toyota Corolla Altis", 1700);
                                                bill.setTotal(1700, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 3) {
                                                userinfo.setName_Price("Toyota Yaris Cross", 1500);
                                                bill.setTotal(1500, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 4) {
                                                userinfo.setName_Price("Toyota Fortuner", 2900);
                                                bill.setTotal(2900, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 5) {
                                                userinfo.setName_Price("Toyota Hilux Revo", 1400);
                                                bill.setTotal(1400, period);
                                                status_select_car = false;
                                            }

                                        } catch (InputMismatchException e) {
                                            System.out.println("********************");
                                            System.out.println("Your select is invalid!");
                                            System.out.println("********************");

                                            input.next();
                                        }

                                    }

                                } else if (selected == 3) {
                                    boolean status_select_car = true;
                                    while (status_select_car) {
                                        try {
                                            Mazda myMazda = new Mazda();
                                            myMazda.displayMazdaCars();
                                            System.out.print("Which car you that you want? = ");
                                            int user_selected_car = input.nextInt();

                                            if (user_selected_car < 1 || user_selected_car > 6) {
                                                System.out.println("Please enter 1-5!");
                                            } else if (user_selected_car == 1) {
                                                userinfo.setName_Price("Mazda 2", 900);
                                                bill.setTotal(900, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 2) {
                                                userinfo.setName_Price("Mazda 3", 1800);
                                                bill.setTotal(1800, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 3) {
                                                userinfo.setName_Price("Mazda CX-30", 1600);
                                                bill.setTotal(1600, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 4) {
                                                userinfo.setName_Price("Mazda CX-5", 2300);
                                                bill.setTotal(2300, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 5) {
                                                userinfo.setName_Price("Mazda MX-5 Miata", 5500);
                                                bill.setTotal(5500, period);
                                                status_select_car = false;
                                            }

                                        } catch (InputMismatchException e) {
                                            System.out.println("********************");
                                            System.out.println("Your select is invalid!");
                                            System.out.println("********************");

                                            input.next();
                                        }

                                    }

                                } else if (selected == 4) {
                                    boolean status_select_car = true;
                                    while (status_select_car) {
                                        try {
                                            Nissan myNissan = new Nissan();
                                            myNissan.displayNissanCars();
                                            System.out.print("Which car you that you want? = ");
                                            int user_selected_car = input.nextInt();

                                            if (user_selected_car < 1 || user_selected_car > 6) {
                                                System.out.println("Please enter 1-5!");
                                            } else if (user_selected_car == 1) {
                                                userinfo.setName_Price("Nissan Almera", 850);
                                                bill.setTotal(850, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 2) {
                                                userinfo.setName_Price("Nissan Kicks e-POWER", 1400);
                                                bill.setTotal(1400, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 3) {
                                                userinfo.setName_Price("Nissan Navara", 1300);
                                                bill.setTotal(1300, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 4) {
                                                userinfo.setName_Price("Nissan Terra", 2600);
                                                bill.setTotal(2600, period);
                                                status_select_car = false;
                                            } else if (user_selected_car == 5) {
                                                userinfo.setName_Price("Nissan GT-R", 18000);
                                                bill.setTotal(18000, period);
                                                status_select_car = false;
                                            }

                                        } catch (InputMismatchException e) {
                                            System.out.println("********************");
                                            System.out.println("Your select is invalid!");
                                            System.out.println("********************");

                                            input.next();
                                        }

                                    }

                                }

                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Your answer is invalid");

                            input.next();
                        }
                    }

                } else if (user_choose == 2) {
                    userinfo.ShowInfo();
                    bill.ShowTotal();
                } else if (user_choose == 3) {
                    System.out.println("Thank you for Booking");
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
    }
}

// git add .
// git commit -m " ข้อความ"
// git push -u origin main