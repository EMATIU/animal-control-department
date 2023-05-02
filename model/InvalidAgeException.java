package model;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(){
        super("You are too young! (only 18+ are accepted)");
    }
}
