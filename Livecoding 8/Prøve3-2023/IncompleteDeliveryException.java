public class IncompleteDeliveryException extends Exception {
    
    IncompleteDeliveryException() {
        super("*** Ordren er ikke under levering");
    }
    
}