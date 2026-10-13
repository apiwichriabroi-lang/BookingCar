import java.util.ArrayList;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;

    }

    public void ShowCar() {
        System.out.println(name);
    }

}

class Honda extends Car {
    ArrayList<Car> honda = new ArrayList<>();

    public Honda() {

        Car nsx = new Car("1) Honda nsx = 1,100฿/Day");
        Car civic = new Car("2) Honda Civic = 1,900฿/Day");
        Car accord = new Car("3) Honda Accord = 2,800฿/Day");
        Car crv = new Car("4) Honda CR-V = 2,500฿/Day");
        Car hrv = new Car("5) Honda HR-V = 1,600฿/Day");
        Car city = new Car("6) Honda City = 1,200฿/Day");

        super("Honda");
        honda.add(nsx);
        honda.add(civic);
        honda.add(accord);
        honda.add(crv);
        honda.add(hrv);
        honda.add(city);

    }

    public void displayHondaCars() {
        for (Car car : honda) {
            car.ShowCar(); // เรียกใช้เมธอด ShowCar ที่เราเคยสร้างไว้ในคลาสแม่
        }
    }

}

class Toyota extends Car {
    ArrayList<Car> Toyota = new ArrayList<>();

    public Toyota() {

        Car camry = new Car("1) Toyota Camry = 2,800฿/Day");
        Car corolla = new Car("2) Toyota Corolla Altis = 1,700฿/Day");
        Car yaris = new Car("3) Toyota Yaris Cross = 1,500฿/Day");
        Car fortuner = new Car("4) Toyota Fortuner = 2,900฿/Day");
        Car hilux = new Car("5) Toyota Hilux Revo = 1,400฿/Day");

        super("Toyota");
        Toyota.add(camry);
        Toyota.add(corolla);
        Toyota.add(yaris);
        Toyota.add(hilux);
        Toyota.add(fortuner);

    }

    public void displayToyotaCars() {
        for (Car car : Toyota) {
            car.ShowCar(); // เรียกใช้เมธอด ShowCar ที่เราเคยสร้างไว้ในคลาสแม่
        }
    }

}

class Mazda extends Car {
    ArrayList<Car> Mazda = new ArrayList<>();

    public Mazda() {

        Car mazda2 = new Car("1) Mazda 2 = 900฿/Day");
        Car mazda3 = new Car("2) Mazda 3 = 1,800฿/Day");
        Car cx30 = new Car("3) Mazda CX-30 = 1,600฿/Day");
        Car cx5 = new Car("4) Mazda CX-5 = 2,300฿/Day");
        Car mx5 = new Car("5) Mazda MX-5 Miata = 5,500฿/Day");

        super("Mazda");
        Mazda.add(mazda2);
        Mazda.add(mazda3);
        Mazda.add(cx30);
        Mazda.add(cx5);
        Mazda.add(mx5);

    }

    public void displayMazdaCars() {
        for (Car car : Mazda) {
            car.ShowCar(); // เรียกใช้เมธอด ShowCar ที่เราเคยสร้างไว้ในคลาสแม่
        }
    }

}

class Nissan extends Car {
    ArrayList<Car> Nissan = new ArrayList<>();

    public Nissan() {

        Car almera = new Car("1) Nissan Almera = 850฿/Day");
        Car kicks = new Car("2) Nissan Kicks e-POWER = 1,400฿/Day");
        Car navara = new Car("3) Nissan Navara = 1,300฿/Day");
        Car terra = new Car("4) Nissan Terra = 2,600฿/Day");
        Car gtr = new Car("5) Nissan GT-R = 18,000฿/Day");

        super("Nissan");
        Nissan.add(almera);
        Nissan.add(kicks);
        Nissan.add(navara);
        Nissan.add(terra);
        Nissan.add(gtr);

    }

    public void displayNissanCars() {
        for (Car car : Nissan) {
            car.ShowCar(); // เรียกใช้เมธอด ShowCar ที่เราเคยสร้างไว้ในคลาสแม่
        }
    }

}