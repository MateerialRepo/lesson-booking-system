package com.main;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private ArrayList<Booking> bookings;
    private ArrayList<Exercise> exercises;


    public Student(String studentName, ArrayList<Booking> bookings, ArrayList<Exercise> exercises) {
        this.studentName = studentName;
        this.bookings = bookings;
        this.exercises = exercises;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    //************ Booking list Operations
    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void addBooking(Booking b){
        bookings.add(b);
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
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
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", bookings=" + bookings +
                ", exercises=" + exercises +
                '}';
    }
}
