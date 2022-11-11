package collection.list;


import modal.Employee;
import modal.Restaurant;

import java.util.ArrayList;

public class RestaurantArrayList {

    public ArrayList<Restaurant> RestaurantList() {

        ArrayList<Restaurant> restaurantArrayList = new ArrayList<Restaurant>();

        Restaurant rest1 = new Restaurant("pinch of spice", "agra", "veg", 12);
        Restaurant rest2 = new Restaurant("chokho jeeman", "delhi gate", "veg", 15);


        restaurantArrayList.add(rest1);
        restaurantArrayList.add(rest2);

        return restaurantArrayList;

    }

    public static void main(String[] args) {

        RestaurantArrayList obj = new RestaurantArrayList();
        ArrayList<Restaurant> restaurantArrayList = obj.RestaurantList();


        for (Restaurant var : restaurantArrayList) {

            System.out.println("Printing Restaurant data :--- namme  :" + var.getName() + "  address :"
                    + var.getAddress() + "   type  : " + var.getType() + " code  : " + var.getCode());
        }
    }

}
