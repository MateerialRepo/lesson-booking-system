package com.main;

public class ExerciseCalendar {
    ExerciseDay day;
    ExerciseAndTime rota;

    public ExerciseCalendar(ExerciseDay day, ExerciseAndTime rota) {
        this.day = day;
        this.rota = rota;
    }

    public ExerciseDay getDay() {
        return day;
    }

    public void setDay(ExerciseDay day) {
        this.day = day;
    }

    public ExerciseAndTime getRota() {
        return rota;
    }

    public void setRota(ExerciseAndTime rota) {
        this.rota = rota;
    }

    @Override
    public String toString() {
        return "day=" + day +
                ", rota=" + rota;
    }
}
