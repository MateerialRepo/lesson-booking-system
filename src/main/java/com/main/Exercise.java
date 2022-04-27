package com.main;

import java.util.List;

public class Exercise {
    private String exerciseName;
    private float exercisePrice;
    private List<String> exerciseReviews;
    private List<Integer> exerciseRatings;
    private int studentAttended = 0;


    public Exercise(String exerciseName, float exercisePrice, List<String> exerciseReviews, List<Integer> exerciseRatings) {
        this.exerciseName = exerciseName;
        this.exercisePrice = exercisePrice;
        this.exerciseReviews = exerciseReviews;
        this.exerciseRatings = exerciseRatings;
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

    //attend exercise and show no of students that attended exercise
    public void attendExercise(){
        studentAttended++;
    }

    public int getNumberOfStudentsThatAttended(){
        return studentAttended;
    }


    //adding and getting Exercise reviews
    public void addExerciseReview(String review) {
        exerciseReviews.add(review);
    }

    public List<String> getExerciseReviews() {
       return exerciseReviews;
    }

    //adding and getting lesson rating
    public void addExerciseRating(int rating) {

        exerciseRatings.add(rating);
    }

    public List<Integer> getExerciseRatings() {

       return exerciseRatings;
    }

    @Override
    public String toString() {
        return "exerciseName='" + exerciseName + '\'' +
                ", exercisePrice=" + exercisePrice +
                ", exerciseReviews=" + exerciseReviews +
                ", exerciseRatings=" + exerciseRatings +
                ", studentRegistered=" + studentAttended;
    }
}
