public class Test {
    static void test1() {
        OnlineOrder testOrder = new OnlineOrder("Sebastian", "produkt", 10);
        testOrder.deliver("claus");
        testOrder.handleOrder();
    }
    
    static void test21() {
        OnlineOrder testOrder = new OnlineOrder(null, "produkt", 10);
    }
    
    static void test22() {
        try {
            test21();    
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void test3() {
        OnlineOrder testOrder = new OnlineOrder("Sebastian", "produkt", 10);
        testOrder.handleOrder();
    }
    
    static void test41() {
        OnlineOrder testOrder = new OnlineOrder("Sebastian", "produkt", 10);
        testOrder.deliver("Claus");
    }
    
    static void test42() {
        try {
            test41();    
        } catch (IllegalCourierException e) {
            System.out.println(e.getMessage() + "'" + e.getIllegalCourier() + "'");
        }
    }
}