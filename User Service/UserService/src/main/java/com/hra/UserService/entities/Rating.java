package com.hra.UserService.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feedback;
}
