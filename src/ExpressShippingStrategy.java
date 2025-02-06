public class ExpressShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculateCost(Order order) {
        return order.getWeight() * 1.5 + order.getDistance() * 0.5;
    }
}