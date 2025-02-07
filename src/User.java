public class User {
    public static void main(String[] args) {

        System.out.println("Première commande");
        Order order = new Order(10, 50, true, true);

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

        System.out.println("Deuxième commande");
        Order order2 = new Order(20, 120, false, false);

        ShippingCalculator standard2 = new ShippingCalculator(new StandardShippingStrategy(), order2);
        System.out.println("Coût Standard : " +standard2.calculateShipping());

        ShippingCalculator express2 = new ShippingCalculator(new ExpressShippingStrategy(), order2);
        System.out.println("Coût Express : " +express2.calculateShipping());

        ShippingCalculator international2 = new ShippingCalculator(new InternationalShippingStrategy(), order2);
        System.out.println("Coût International : " +international2.calculateShipping());

        ShippingCalculator eco2 = new ShippingCalculator(new EcoShippingStrategy(), order2);
        System.out.println("Coût Éco : " +eco2.calculateShipping());

        ShippingCalculator sameDay2 = new ShippingCalculator(new SameDayShippingStrategy(), order2);
        System.out.println("Coût Livraison le Jour Même : " +sameDay2.calculateShipping());



    }
}
