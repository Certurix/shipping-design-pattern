public class ExpressShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculateCost(Order order) {
        double cost = order.getWeight() * 1.5 + order.getDistance() * 0.5;
        return order.applyPremiumDiscount(cost);
    }
}