package se.kth.iv1350.bikeshop.util;

import se.kth.iv1350.bikeshop.controller.Controller;
import se.kth.iv1350.bikeshop.integration.*; 
import java.lang.reflect.InvocationTargetException;

/**
 * Contains a main method of the log API client, which loads new
 * <code>Logger</code> implementations at runtime.
 */
public class LoadImplAtRuntime {

    private int msgNo = 1;
    private Controller client = new Controller(registryCreator, printer);
    //RegistryCreator registryCreator = new RegistryCreator();

    /**
     * @param args Each command line parameter shall be the fully qualified
     * class name of a class implementing <code>Logger</code>. This class will
     * be loaded and used.     * @throws java.lang.InstantiationException If failed to load log classes.
     * @throws java.lang.IllegalAccessException If failed to load log classes.
     * @throws java.lang.ClassNotFoundException If failed to load log classes.
     * @throws java.lang.NoSuchMethodException If failed to load log classes.
     * @throws java.lang.reflect.InvocationTargetException If failed to load log classes.
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
                                        ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        LoadImplAtRuntime main = new LoadImplAtRuntime();
        for (String loggerClassName : args) {
            main.loadAndUseLogger(loggerClassName);
        }
    }

    private void loadAndUseLogger(String loggerClassName) throws
            InstantiationException, IllegalAccessException,
            ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class logClass = Class.forName(loggerClassName);
        Logger logger = (Logger) logClass.getDeclaredConstructor().newInstance();
        registryCreator.getCustomerRegistry().setLogger(logger);
        registryCreator.getCustomerRegistry().findCustomer(phoneNr, msgNo);
        controller.searchCustomer(loggerClassName);


    }
}
