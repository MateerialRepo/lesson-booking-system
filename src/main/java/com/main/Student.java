package com.main;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<ExerciseCalendar> exerciseBookings;
    private ArrayList<Exercise> exercises;


    public Student(String studentName, ArrayList<ExerciseCalendar> exerciseBookings, ArrayList<Exercise> exercises) {
        this.studentName = studentName;
        this.exerciseBookings = exerciseBookings;
        this.exercises = exercises;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    //************ Booking list Operations
    public ArrayList<ExerciseCalendar> getExerciseBookings() {
        return exerciseBookings;
    }

    public void addBooking(ExerciseCalendar b){
        exerciseBookings.add(b);
    }

    public void setExerciseBookings(ArrayList<ExerciseCalendar> exerciseBookings) {
        this.exerciseBookings = exerciseBookings;
    }


    //************ Exercise list Operations
    public void addExercise(Exercise e){
        exercises.add(e);
    }
    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
    }

    @Override
    public String toString() {
        return "{" +
                "Name: " + studentName + '\'' +
                ", bookings: " + exerciseBookings +
                ", exercises enrolled for: " + exercises +
                '}';
    }
}
