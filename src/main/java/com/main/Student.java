package com.main;

import java.util.List;

public class Student {
    private String stdName;
    private List<String> lessonBookings;

    public Student(String stdName, List<String> lessonBookings){
        this.stdName = stdName;
        this.lessonBookings = lessonBookings;
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
        return "com.main.Student{" +
                "stdName='" + stdName + '\'' +
                ", lessonBookings=" + lessonBookings +
                '}';
    }



}
