package com.main;

public class ExerciseCalendar {
    ExerciseDay day;
    ExerciseSession session;
    Exercise exercise;

    public ExerciseCalendar(Exercise exercise, ExerciseDay day, ExerciseSession session) {
        this.day = day;
        this.session = session;
        this.exercise = exercise;
    }

    public ExerciseCalendar(Exercise exercise, ExerciseSession session) {
        this.session = session;
        this.exercise = exercise;
    }

    public ExerciseDay getDay() {
        return day;
    }

    public void setDay(ExerciseDay day) {
        this.day = day;
    }

    public ExerciseSession getSession() {
        return session;
    }

    public void setSession(ExerciseSession session) {
        this.session = session;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    @Override
    public String toString() {
        return "{" + day +
                ", " + session +
                ", " + exercise +
                '}';
    }
}
