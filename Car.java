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
        

        Car hondaCity = new Car("1) Honda City");
        Car civic = new Car("2) Honda Civic");
        Car accord = new Car("3) Honda Accord");
        Car crv = new Car("4) Honda CR-V");
        Car hrv = new Car("5) Honda HR-V");
        Car city = new Car("6) Honda City");

        super("Honda");
        honda.add(hondaCity);
        honda.add(civic);
        honda.add(accord);
        honda.add(crv);
        honda.add(city);
        honda.add(hrv);

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
        
        
        Car camry = new Car("1) Toyota Camry");
        Car corolla = new Car("2) Toyota Corolla Altis");
        Car yaris = new Car("3) Toyota Yaris Cross");
        Car fortuner = new Car("4) Toyota Fortuner");
        Car hilux = new Car("5) Toyota Hilux Revo");

        super("Toyota");
        Toyota.add(camry);
        Toyota.add(corolla);
        Toyota.add(yaris);
        Toyota.add(hilux);
        Toyota.add(fortuner);

    }

    public void displayHondaCars() {
        for (Car car : Toyota) {
            car.ShowCar(); // เรียกใช้เมธอด ShowCar ที่เราเคยสร้างไว้ในคลาสแม่
        }
    }

}
class Mazda extends Car {
    ArrayList<Car> Mazda = new ArrayList<>();

    public Mazda() {
        
        
        Car mazda2 = new Car("1) Mazda 2");
        Car mazda3 = new Car("2) Mazda 3");
        Car cx30 = new Car("3) Mazda CX-30");
        Car cx5 = new Car("4) Mazda CX-5");
        Car mx5 = new Car("5) Mazda MX-5 Miata");

        super("Mazda");
        Mazda.add(mazda2);
        Mazda.add(mazda3);
        Mazda.add(cx30);
        Mazda.add(cx5);
        Mazda.add(mx5);

    }

    public void displayHondaCars() {
        for (Car car : Mazda) {
            car.ShowCar(); // เรียกใช้เมธอด ShowCar ที่เราเคยสร้างไว้ในคลาสแม่
        }
    }

}
class Nissan extends Car {
    ArrayList<Car> Nissan = new ArrayList<>();

    public Nissan() {
        
        
        Car almera = new Car("1) Nissan Almera");
        Car kicks = new Car("2) Nissan Kicks e-POWER");
        Car navara = new Car("3) Nissan Navara");
        Car terra = new Car("4) Nissan Terra");
        Car gtr = new Car("5) Nissan GT-R");

        super("Mazda");
        Nissan.add(almera);
        Nissan.add(kicks);
        Nissan.add(navara);
        Nissan.add(terra);
        Nissan.add(gtr);

    }

    public void displayHondaCars() {
        for (Car car : Nissan) {
            car.ShowCar(); // เรียกใช้เมธอด ShowCar ที่เราเคยสร้างไว้ในคลาสแม่
        }
    }

}