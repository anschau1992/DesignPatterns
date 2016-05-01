package pizza;

/**
 * Created by Andy on 01.05.16.
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Vegetables");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
