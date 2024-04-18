import java.util.ArrayList;
import java.util.List;

public class Item {
    //General item info
    static int itemId = 0;
    int amount;

    //Pizza and Drinks
    String pizzaSize;
    String pizzaStyle;
    String Toppings;

    String drinkSize;
    String drinkType;

    //Order Info
    int orderID;
    String orderHistory;

    //Constructors
    Item(String pSize, String pStyle, String toppings){
        this.pizzaSize = pSize;
        this.pizzaStyle = pStyle;
        this.Toppings = toppings;
    }

    Item(String dSize, String dType){
        this.drinkSize = dSize;
        this.drinkType = dType;
    }
}
