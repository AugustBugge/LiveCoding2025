public class IllegalCourierException extends RuntimeException {
    String illegal_courier;
    
    IllegalCourierException(String illegal_courier) {
        super("*** ulovligt bud");
        this.illegal_courier = illegal_courier;
    }
    
    String getIllegalCourier() {
        return illegal_courier;
    }
}