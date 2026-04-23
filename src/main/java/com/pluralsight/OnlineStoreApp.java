package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OnlineStoreApp {
    public static void main(String[] args) throws IOException {
        getProducts();
    }
    public static <Product> void getProducts() throws IOException {
        ArrayList<Product> productList = new ArrayList<Product>();
        FileReader fileReader = new FileReader("src/main/resources/products.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String prodLine;

        while((prodLine = bufferedReader.readLine()) != null){
            String[] prodArray = prodLine.split("\\|");
            if(prodArray[0].equalsIgnoreCase("sku")){
                bufferedReader.readLine();
            }else{
                System.out.printf("%s|%s|%.2f|%s\n",prodArray[0],prodArray[1], Double.parseDouble(prodArray[2]), prodArray[3]);
            }


        }
    }


}
