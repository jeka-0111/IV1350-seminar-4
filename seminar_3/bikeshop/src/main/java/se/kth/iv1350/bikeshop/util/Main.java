package se.kth.iv1350.bikeshop.util;

import se.kth.iv1350.bikeshop.integration.CustomerRegistry;

public class Main {
    public static void main(String[] args) {
        CustomerRegistry client = new CustomerRegistry();
        
        client.setLogger(new FileLogger());
        client.findCustomer(1);
    }
}
