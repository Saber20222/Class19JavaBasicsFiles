package com.syntax.class19;

import java.lang.reflect.Constructor;

public class Task4 {
    /* Write a java class that will have a constructor:
    one with parameters and second without any parameters.
    Create a separate Test class where you will execute
    both of the constructors 1 by 1.
     */

    Task4(){
        System.out.println("Constructor one with empty parameters");
    }
    Task4(String name ){
        System.out.println("Constructor two which has a String Parameter");
    }

}
