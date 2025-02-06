public class User {
    public static void main(String[] args) {
        // Création et simulation d'une nouvelle commande
        Order order = new Order(10, 50, true, true);
        
        // TODO: Implémenter une réduction si l'utilisateur est premium.

        // Test des différentes stratégies de livraison avec le même format que l'exemple
        ShippingCalculator standard = new ShippingCalculator(new StandardShippingStrategy(), order);
        System.out.println("Coût Standard : " + standard.calculateShipping());

        ShippingCalculator express = new ShippingCalculator(new ExpressShippingStrategy(), order);
        System.out.println("Coût Express : " + express.calculateShipping());

        ShippingCalculator international = new ShippingCalculator(new InternationalShippingStrategy(), order);
        System.out.println("Coût International : " + international.calculateShipping());

        ShippingCalculator eco = new ShippingCalculator(new EcoShippingStrategy(), order);
        System.out.println("Coût Éco : " + eco.calculateShipping());

        ShippingCalculator sameDay = new ShippingCalculator(new SameDayShippingStrategy(), order);
        System.out.println("Coût Livraison le Jour Même : " + sameDay.calculateShipping());
    }
}
