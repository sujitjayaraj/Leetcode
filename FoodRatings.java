//Question 2353 named Design a Food Rating System

import java.util.HashMap;
import java.util.TreeSet;

class FoodRatings
{
    final HashMap<String, Food> foodRating;
    final HashMap<String, TreeSet<Food>> cuisines;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodRating = new HashMap<>();
        this.cuisines = new HashMap<>();
        for(int i=0; i<foods.length; i++){
            Food newItem = new Food(foods[i], cuisines[i], ratings[i]);
            foodRating.put(foods[i], newItem);
            if(this.cuisines.containsKey(cuisines[i])){
                this.cuisines.get(cuisines[i]).add(newItem);
            }
            else{
                TreeSet<Food> newSet = new TreeSet<>();
                newSet.add(newItem);
                this.cuisines.put(cuisines[i], newSet);
            }
        }
    }
    
    public void changeRating(String food, int newRating) {
        if(foodRating.containsKey(food)){
            Food item = foodRating.get(food);
            cuisines.get(item.cuisine).remove(item);
            item.rating = newRating;
            foodRating.put(food, item);
            cuisines.get(item.cuisine).add(item);
        }
    }
    
    public String highestRated(String cuisine) {
        return cuisines.get(cuisine).last().name;
    }
}

class Food implements Comparable<Food>
{
    int rating;
    String name, cuisine;
    public Food(String name, String cuisine, int rating){
        this.rating = rating;
        this.name = name;
        this.cuisine = cuisine;
    }

    @Override
    public int compareTo(Food anotherFood){
        if(this.rating == anotherFood.rating){
            return anotherFood.name.compareTo(this.name);
        }

        return this.rating - anotherFood.rating;
    }
}