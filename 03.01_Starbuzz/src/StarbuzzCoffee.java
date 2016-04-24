import beverages.Beverage;
import beverages.DarkRoast;
import beverages.Espresso;
import beverages.HouseBlend;
import condimentDecorators.Mocha;
import condimentDecorators.Soy;
import condimentDecorators.Whip;

public class StarbuzzCoffee {

    public static void main (String args[]) {
        Beverage beverage = new Espresso();
        printOutOrder(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        printOutOrder(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        printOutOrder(beverage3);
    }

    private static void printOutOrder(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
