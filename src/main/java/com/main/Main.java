package com.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

   //static Scanner input = new Scanner(System.in);

   //Map<String, String> map = new HashMap<>();

   //Initialize Lessons
   Exercise yoga = new Exercise("YOGA", 200);
   Exercise dance = new Exercise("DANCE", 250);
   Exercise zumba = new Exercise("ZUMBA", 300);
   Exercise boxFit = new Exercise("BOX FIT", 100);
   Exercise bodyBlitz = new Exercise("BODY BLITZ", 200);

   //Initialize days
   ExerciseDay saturday = ExerciseDay.SATURDAY;
   ExerciseDay sunday = ExerciseDay.SUNDAY;

   //Initialize sessions
   ExerciseSession morning = ExerciseSession.MORNING;
   ExerciseSession afternoon = ExerciseSession.AFTERNOON;
   ExerciseSession evening = ExerciseSession.EVENING;

   //create Exercise modules
   ExerciseModule week1SatYoga = new ExerciseModule(yoga, saturday, morning );
   ExerciseModule week1SunYoga = new ExerciseModule(yoga, sunday, morning );


   public static void main(String[] args){






   }
}
