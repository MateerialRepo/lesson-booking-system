package com.main;

public class ExerciseAndTime {
    Exercise exercise;
    ExerciseSession session;

    public ExerciseAndTime(Exercise exercise, ExerciseSession session) {
        this.exercise = exercise;
        this.session = session;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public ExerciseSession getSession() {
        return session;
    }

    public void setSession(ExerciseSession session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "{" + exercise + ", " + session + "}";
    }
}
