package com.hra.RatingService.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("user_ratings")  //for mongo db we have to use @Document instead of @Entity
public class Rating {

	@Id
	private String ratingId;   //Mongo db generates ID by itself
	private String userId;
	private String hotelId;
	private int rating;
	private String feedback;
}
