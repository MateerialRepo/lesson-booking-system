package com.main;

public class ExerciseModule {
    private Exercise exercise;
    private ExerciseDay exerciseDay;
    private ExerciseSession exerciseTime;
    
    public ExerciseModule(Exercise exercise, ExerciseDay exerciseDay, ExerciseSession exerciseTime) {
        this.exercise = exercise;
        this.exerciseDay = exerciseDay;
        this.exerciseTime = exerciseTime;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public ExerciseDay getExerciseDay() {
        return exerciseDay;
    }

    public void setExerciseDay(ExerciseDay exerciseDay) {
        this.exerciseDay = exerciseDay;
    }

    public ExerciseSession getExerciseTime() {
        return exerciseTime;
    }

    public void setExerciseTime(ExerciseSession exerciseTime) {
        this.exerciseTime = exerciseTime;
    }
}
