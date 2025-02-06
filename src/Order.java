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

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public boolean isEcoFriendly() {
        return ecoFriendly;
    }
}
