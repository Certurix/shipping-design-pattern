public class StandardShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculateCost(Order order) {
        // Implémentation fictive du calcul
        double cost = order.getWeight() * 1.2;
        return order.applyPremiumDiscount(cost);
    }
}