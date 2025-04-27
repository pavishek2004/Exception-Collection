package exceptionCollection;
import java.util.Scanner;

class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}