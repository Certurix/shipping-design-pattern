public class Order {
    private double weight;
    private double distance;
    private boolean premiumMember;
    private boolean ecoFriendly;

    public Order(double weight, double distance, boolean premiumMember, boolean ecoFriendly) {
        this.weight = weight;
        this.distance = distance;
        this.premiumMember = premiumMember;
        this.ecoFriendly = ecoFriendly;
    }

    public double applyPremiumDiscount(double cost) {
        return premiumMember ? cost * 0.8 : cost;
    }

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }

    public boolean isEcoFriendly() {
        return ecoFriendly;
    }
}
