package com.main;

import java.util.*;

public class Main {

   //static Scanner input = new Scanner(System.in);

   //Map<String, String> map = new HashMap<>();





   public static void main(String[] args){
      //Initialize Lessons
      Exercise yoga = new Exercise("YOGA", 200, new ArrayList(), new ArrayList());
      Exercise dance = new Exercise("DANCE", 250, new ArrayList(), new ArrayList());
      Exercise zumba = new Exercise("ZUMBA", 300, new ArrayList(), new ArrayList());
      Exercise boxFit = new Exercise("BOX FIT", 100, new ArrayList(), new ArrayList());
      Exercise bodyBlitz = new Exercise("BODY BLITZ", 150, new ArrayList(), new ArrayList());
      Exercise aquacise = new Exercise("AQUACISE", 170, new ArrayList(), new ArrayList());

      //Initialize days
      ExerciseDay saturday = ExerciseDay.SATURDAY;
      ExerciseDay sunday = ExerciseDay.SUNDAY;

      //Initialize sessions
      ExerciseSession morning = ExerciseSession.MORNING;
      ExerciseSession afternoon = ExerciseSession.AFTERNOON;
      ExerciseSession evening = ExerciseSession.EVENING;

      //create exercise schedule


   }
}
