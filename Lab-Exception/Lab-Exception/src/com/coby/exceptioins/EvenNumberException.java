package com.coby.exceptioins;

public class EvenNumberException extends Exception {
    @Override
    public String getMessage() {
        return "You cannot input an even number.";
    }
}