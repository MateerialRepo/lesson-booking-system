package com.main;

public class Booking {
    private ExerciseClass exercise;
    private Student student;



    public void BookExercise( ExerciseClass exercise, Student student) {
        this.exercise = exercise;
        this.student = student;
    }


    public void ChangeExercise( ExerciseClass exercise) {
        this.exercise = exercise;

    }


    public void DeleteExercise( ExerciseClass exercise) {
        this.exercise = exercise;

    }

    
}
