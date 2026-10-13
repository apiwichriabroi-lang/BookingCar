public class Userinfo {
    private String car_name;
    private int car_price;
    private int period;

    public Userinfo(String name, int car_price) {
        this.car_name = name;
        this.car_price = car_price;
    }

    public Userinfo(int period) {
        this.period = period;
    }

    public Userinfo() {

    }

    public void setName_Price(String name, int price) {
        this.car_name = name;
        this.car_price = price;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void ShowInfo() {
        System.out.println("------------------------------------------");
        System.out.printf("Car name = %s\n", car_name);
        System.out.printf("Car price = %d ฿\n", car_price);
        System.out.printf("Period = %d Day\n", period);
    }

}
