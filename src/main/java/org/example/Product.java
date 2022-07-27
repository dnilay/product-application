package org.example;

import java.util.Random;

//product class
//added productID attribute
public class Product {

    private int productId;

    public Integer getProductId()
    {
        productId=new Random().nextInt(1000);
        return productId;
    }
}
