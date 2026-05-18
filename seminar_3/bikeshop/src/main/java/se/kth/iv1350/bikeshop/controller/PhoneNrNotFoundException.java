package se.kth.iv1350.bikeshop.controller;

public class PhoneNrNotFoundException extends Exception{
    public PhoneNrNotFoundException(){
        super("The searched phone number is not found");
    }
}
