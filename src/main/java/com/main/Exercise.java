package com.main;

import java.util.List;

public class Exercise {
    private String exerciseName;
    private float exercisePrice;
    private List<String> exerciseReviews;
    private List<Integer> exerciseRatings;
    private int studentRegistered = 0;


    public Exercise(String exerciseName, float exercisePrice) {
        this.exerciseName = exerciseName;
        this.exercisePrice = exercisePrice;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public float getExercisePrice() {
        return exercisePrice;
    }

    public void setExercisePrice(float exercisePrice) {
        this.exercisePrice = exercisePrice;
    }

    public void registerStudent(){
        studentRegistered++;
    }

    public int getNumberOfRegisteredStudents(){
        return studentRegistered;
    }


    //adding and getting Exercise reviews
    public void addExerciseReview(String review) {
        exerciseReviews.add(review);
    }

    public List<String> getExerciseReviews() {
       return this.exerciseReviews = exerciseReviews;
    }

    //adding and getting lesson rating
    public void addExerciseRating(int rating) {

        exerciseRatings.add(rating);
    }

    public List<Integer> getExerciseRatings() {

       return this.exerciseRatings = exerciseRatings;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "exerciseName='" + exerciseName + '\'' +
                ", exercisePrice=" + exercisePrice +
                ", exerciseReviews=" + exerciseReviews +
                ", exerciseRatings=" + exerciseRatings +
                ", studentRegistered=" + studentRegistered +
                '}';
    }
}
