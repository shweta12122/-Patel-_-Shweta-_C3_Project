package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	//	Restaurant resturant = new Restaurant("XYZ","varanasi", LocalTime.MIDNIGHT, LocalTime.NOON);
		RestaurantService rs = new RestaurantService();
		rs.addRestaurant("yelchiko", "Allahabd", LocalTime.NOON,LocalTime.MIDNIGHT);
		rs.addRestaurant("Friends", "Allahabd", LocalTime.NOON,LocalTime.MIDNIGHT);
		rs.addRestaurant("Behind Yello Door", "Varanasi", LocalTime.NOON,LocalTime.MIDNIGHT);
		rs.addRestaurant("Taj", "Varanasi", LocalTime.NOON,LocalTime.MIDNIGHT);
		System.out.println(rs);
		try {
			Restaurant removedResturant = rs.removeRestaurant("yelchiko");
			removedResturant.displayDetails();
			Restaurant restaurant = rs.findRestaurantByName("Taj");
			restaurant.displayDetails();
		} catch (restaurantNotFoundException e) {
			e.printStackTrace();
		}
		SpringApplication.run(DemoApplication.class, args);
	}

}
