public class InternationalShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculateCost(Order order) {
        return order.getWeight() * 2.0 + order.getDistance() * 1.0;
    }
}