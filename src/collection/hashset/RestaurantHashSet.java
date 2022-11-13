package collection.hashset;

import modal.Restaurant;

import java.util.HashSet;

public class RestaurantHashSet {


    public HashSet<Restaurant> restaurantHashSet (){

        HashSet<Restaurant> restaurantHashSet = new HashSet<>();

        Restaurant rest1 = new Restaurant("kamal", "agra", "veg", 96);
        System.out.println("hash code of rest1  : "  +rest1.hashCode());

        Restaurant rest2 = new Restaurant("harry", "delhi", "non veg", 35);
        System.out.println("hash code of rest2  : "   +rest2.hashCode());

        Restaurant rest3 = new Restaurant("harry", "delhi", "non veg", 35);
        System.out.println("hash code of rest3   : "   +rest3.hashCode());


        restaurantHashSet.add(rest1);
        restaurantHashSet.add(rest2);
        restaurantHashSet.add(rest3);

        return restaurantHashSet;

    }


    public static void main(String[] args) {

        RestaurantHashSet obj = new RestaurantHashSet();
        HashSet<Restaurant> restaurantHashSet= obj.restaurantHashSet();


        for(Restaurant  var : restaurantHashSet){

            System.out.println("Printing data of restaurant  : " +var.getName()+ "  location : "  +var.getLocation()+
            "   type  : "  +var.getType()+ " id  : " + var.getId());
        }
    }
}
