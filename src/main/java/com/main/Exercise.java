package com.main;

import java.util.List;

public class Exercise {
    private String exerciseName;
    private float exercisePrice;
    private List<String> exerciseReviews;
    private int studentRegistered;
    private final int max_no_of_student = 4;


    public Exercise(String exerciseName, float exercisePrice, int studentRegistered) {
        this.exerciseName = exerciseName;
        this.exercisePrice = exercisePrice;
        this.studentRegistered = studentRegistered;
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

    public List<String> getExerciseReviews() {
        return exerciseReviews;
    }

    public void setExerciseReviews(List<String> exerciseReviews) {
        this.exerciseReviews = exerciseReviews;
    }
}
