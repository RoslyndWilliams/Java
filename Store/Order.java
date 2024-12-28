package Store;

public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;

    public Order(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        } else {
            System.out.println("Low value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
        } else {
            System.out.println("Order not ready");
        }

        double shippingCost = calculateShipping();

        System.out.println("Shipping cost: ");
        System.out.println(shippingCost);
        System.out.println("-----------");
        System.out.println();
    }

    public double calculateShipping() {
        double shippingCost;
        switch (shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }
        return shippingCost;
    }

    public static void main(String[] args) {
        // create instances and call methods here!

        // create bookTreasureIsland instance
        Order bookTreasureIsland = new Order(false, 8.67, "Regular");
        bookTreasureIsland.ship();

        // create bookGarfield instance
        Order bookGarfield = new Order(true, 24.99, "Regular");
        bookGarfield.ship();

    }
}
