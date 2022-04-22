package com.main;

import java.util.List;

public class ExerciseClass {
    private String exerciseName;
    private float exercisePrice;
    private List<String> exerciseReviews;
    private final int max_no_of_student = 4;


    public ExerciseClass(String exerciseName, float exercisePrice) {
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

    public List<String> getExerciseReviews() {
        return exerciseReviews;
    }

    public void setExerciseReviews(List<String> exerciseReviews) {
        this.exerciseReviews = exerciseReviews;
    }
}
