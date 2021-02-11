package models;

import java.util.ArrayList;

public class Purchases {
    private ArrayList<GroceryItem> shoppingCart;

    public Purchases(){
        shoppingCart = new ArrayList<>();
    }

    public void addGroceryItem(GroceryItem groceryItem){
        shoppingCart.add(groceryItem);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
//        for(int i=0; i<shoppingCart.size(); i++)
//            totalPrice = totalPrice + shoppingCart.get(i).getPrice();

        for(GroceryItem groceryItem : shoppingCart)
            totalPrice += groceryItem.getPrice();

        return totalPrice;
    }
}
