class ShippingCalculator {
    private ShippingCostStrategy strategy;
    private Order order;

    public ShippingCalculator(ShippingCostStrategy strategy, Order order) {
        this.strategy = strategy;
        this.order = order;
    }

    public double calculateShipping() {
        return strategy.calculateCost(order);
    }
}
