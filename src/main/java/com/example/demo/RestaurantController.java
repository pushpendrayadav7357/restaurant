package com.example.demo;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    private List<Restaurant> restaurants = new ArrayList<>();
    private long nextId = 1;

    // Get a Restaurant by ID
    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) {
        Optional<Restaurant> restaurant = restaurants.stream().filter(r -> r.getId().equals(id)).findFirst();
        return restaurant.orElse(null);
    }

    // Get all Restaurants
    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return restaurants;
    }

    // Add a new Restaurant
    @PostMapping
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        restaurant.setId(nextId);
        nextId++;
        restaurants.add(restaurant);
        return restaurant;
    }

    // Update Restaurant information (e.g., Specialty)
    @PutMapping("/{id}")
    public Restaurant updateRestaurant(@PathVariable Long id, @RequestBody Restaurant updatedRestaurant) {
        for (int i = 0; i < restaurants.size(); i++) {
            Restaurant restaurant = restaurants.get(i);
            if (restaurant.getId().equals(id)) {
                // Update restaurant information
                restaurant.setSpecialty(updatedRestaurant.getSpecialty());
                // Update other fields as needed
                restaurants.set(i, restaurant);
                return restaurant;
            }
        }
        return null; // Restaurant not found
    }

    // Delete a Restaurant
    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurants.removeIf(r -> r.getId().equals(id));
    }
}
