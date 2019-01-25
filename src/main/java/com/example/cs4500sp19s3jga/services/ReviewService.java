package com.example.cs4500sp19s3jga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cs4500sp19s3jga.models.Review;
import com.example.cs4500sp19s3jga.repositories.ReviewRepository;
	
@RestController
public class ReviewService {
	@Autowired
	ReviewRepository reviewRepository;
	@GetMapping("/api/reviews")
	public List<Review> findAllReviews() {
		return (List<Review>) reviewRepository.findAll();
	}
	@GetMapping("/api/reviews/{id}")
	public Review findReviewById(
			@PathVariable("id") Integer reviewId) {
		return reviewRepository.findById(reviewId).get();
	}
}
