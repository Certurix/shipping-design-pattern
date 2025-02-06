public class SameDayShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculateCost(Order order) {
        return order.getWeight() * 2.5 + order.getDistance() * 1.5;
    }
}