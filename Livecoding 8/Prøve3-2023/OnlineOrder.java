public class OnlineOrder {
    //Felter: customer, product, cost, beingDelivered, courier
    //Konstruktør: OnlineOrder(…)
    //Metoder: deliver(…), notifyCustomer(), handleOrder()
    private String customer; 
    private String product;
    private int cost;
    private boolean beingDelivered;
    private String courier;
    
    public OnlineOrder(String customer, String product, int cost) {
        if (customer == null || product == null) {
            throw new IllegalArgumentException("*** Kunde eller produkt mangler!");
        }
        this.customer = customer;
        this.product = product;
        this.cost = cost;
        beingDelivered = false;
    }
    
    void deliver(String courier) {
        if (courier == "Sebastian" || courier == "Claus" || courier == "Louise") {
            throw new IllegalCourierException(courier);
        }
        this.courier = courier;
        beingDelivered = true;
    }
    
    //Ordren er ikke blevet leveret
    //Informerer Sebastian om ordren på en Macbook for 7000kr (via Claus).
    
    void notifyCustomer() throws IncompleteDeliveryException {
        if (beingDelivered) {
            System.out.println("Informerer " + customer + " om ordren på en " + product + " for " + cost + "kr (via " + courier + ").");
        } else {
            throw new IncompleteDeliveryException();
            //System.out.println("Ordren er ikke blevet leveret");
        }
    }
    
    void handleOrder() {
        System.out.println("vi arbejder nu på ordren...");
        try {
            notifyCustomer();
        } catch (IncompleteDeliveryException e) {
            System.out.println(e.getMessage());
        }
        
    }
}