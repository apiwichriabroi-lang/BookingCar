public class Total {
    public int price;
    public int period;

    public Total() {

    }

    public void setTotal(int price, int period) {
        this.period = period;
        this.price = price;
    }

    public void ShowTotal() {
        System.out.println("Your total bill are " + price * period + " ฿");
        System.out.println("------------------------------------------");
    }
}
