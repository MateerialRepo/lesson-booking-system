package com.main;

import java.util.List;

public class Student {
    private String stdName;
    private List<Booking> bookings;

    public Student(String stdName, List<String> lessonBookings){
        this.stdName = stdName;
    }

    public void setLessonBookings(List<String> lessonBookings) {
        this.lessonBookings = lessonBookings;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public List<String> getLessonBookings() {
        return lessonBookings;
    }

    public String getStdName() {
        return stdName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", ExerciseBookings=" + bookings +
                '}';
    }



}
