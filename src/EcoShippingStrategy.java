public class EcoShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculateCost(Order order) {
        double cost = order.isEcoFriendly() ? order.getWeight() * 0.8 : order.getWeight();
        return order.applyPremiumDiscount(cost);
    }
}