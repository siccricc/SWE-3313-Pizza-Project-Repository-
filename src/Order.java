import java.time.LocalDate;

public class Order extends Item {
    static int orderId = 0;
    int amount;
    boolean takeout;


    //Getters and Setters
    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isTakeout() {
        return this.takeout;
    }

    public void setTakeout(boolean takeout) {
        this.takeout = takeout;
    }

    //Constructor
    public Order(Customer customer){
        orderId++;
        customer.getCustomerID()
    }

}
