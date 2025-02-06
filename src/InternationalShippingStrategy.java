public class InternationalShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculateCost(Order order) {
        double cost = order.getWeight() * 2.0 + order.getDistance() * 1.2;
        return order.applyPremiumDiscount(cost);
    }
}