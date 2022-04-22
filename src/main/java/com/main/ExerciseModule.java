package com.main;

public class ExerciseModule {
    private ExerciseClass exercise;
    private ExerciseDay exerciseDay;
    private ExerciseSession exerciseTime;
    
    public ExerciseModule(ExerciseClass exercise, ExerciseDay exerciseDay, ExerciseSession exerciseTime) {
        this.exercise = exercise;
        this.exerciseDay = exerciseDay;
        this.exerciseTime = exerciseTime;
    }

}
