package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OnlineStoreApp {
    public static void main(String[] args) throws IOException {
        getProducts();
    }
    public static ArrayList<Product> getProducts() throws IOException {
        ArrayList<Product> productList = new ArrayList<Product>();
        FileReader fileReader = new FileReader("src/main/resources/products.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String prodLine;

        while((prodLine = bufferedReader.readLine()) != null){
            String[] prodArray = prodLine.split("\\|");
            if(prodArray[0].equalsIgnoreCase("sku")){
                bufferedReader.readLine();
            }else{
                productList.add(new Product(prodArray[0], prodArray[1], Double.parseDouble(prodArray[2]), prodArray[3]));
            }


        }
        return productList;
    }


}
