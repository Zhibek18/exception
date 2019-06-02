package kz.kakimzhanova.exception.exception;

public class WrongInputException extends Exception {
    public WrongInputException(){
    }
    public WrongInputException(String message, Throwable exception){
        super(message, exception);
    }
    public WrongInputException(String message){
        super(message);
    }
    public WrongInputException(Throwable exception){
        super(exception);
    }
}
