package server;
/**
 * @author Clay Farrell & Hannah Young
 * @date 11/7/2022
 * Description: This class provides an abstract exception that can be generated by any dealer
 * server. This can be used to "wrap" other exceptions generated by server implementations
 */
public class DealerServerException extends Exception {

    /**
     * Creates a new DealerServerException with no message.
     */
    public DealerServerException(){
        super();
    }

    /**
     * Creates a new DealerServerException with the specified message.
     * @param message - message to be displayed
     */
    public DealerServerException(String message){
        super(message);
    }

    /**
     * Creates a new DealerServerException with the specified message, and
     * wraps the specified Throwable object
     * @param message - message to be displayed
     * @param throwable - can be thrown
     */
    public DealerServerException(String message, Throwable throwable){
        super(message, throwable);
    }

    /**
     * Creates a new DealerServerException that wraps the specified Throwable object
     * @param throwable - can be thrown
     */
    public DealerServerException(Throwable throwable){
        super(throwable);
    }


}
