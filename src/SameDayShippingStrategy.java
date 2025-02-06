public class SameDayShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculateCost(Order order) {
        double cost = order.getWeight() * 2.5 + order.getDistance() * 1.5;
        return order.applyPremiumDiscount(cost);
    }
}