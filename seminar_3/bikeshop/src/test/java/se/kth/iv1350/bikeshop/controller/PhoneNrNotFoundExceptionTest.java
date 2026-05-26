package se.kth.iv1350.bikeshop.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import se.kth.iv1350.bikeshop.dto.*;
import se.kth.iv1350.bikeshop.controller.*;

public class PhoneNrNotFoundExceptionTest{

    private CustomerDTO customer;
    

    @BeforeEach
    

    @Test
    public void testNoExceptionDuringSuccesfulExecution(){
        customer = controller.searchCustomer(0701234567);
    }

    @Test
    public void testIfExceptionIsThrownWhenFailureOccurs(){

    }
    
    @Test
    public void testCorrectMessageIsStored() {
        PhoneNrNotFoundException instance = new PhoneNrNotFoundException();
        String result = instance.getMessage();
        assertEquals("Message to user: The searched phone number is not found", result);
    }

    @Test
    public void testIfCatchBlocksAreHandledCorrectly(){

    }
}