public class StandardShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculateCost(Order order) {
        // Implémentation fictive du calcul
        return order.getWeight() * 1.0;
    }
}