public class EcoShippingStrategy implements ShippingCostStrategy {
    @Override
    public double calculateCost(Order order) {
        return order.isEcoFriendly() ? order.getWeight() * 0.8 : order.getWeight();
    }
}