package com.main;

import java.util.*;

public class Booking {
    List<Exercise> exerciseList = new ArrayList();
    List<ExerciseCalendar> timeTable = new ArrayList();
    List<Student> studentList = new ArrayList();
    List<String> reviewList = new ArrayList();



    //Initialize days
   ExerciseDay saturday = ExerciseDay.SATURDAY;
   ExerciseDay sunday = ExerciseDay.SUNDAY;

   //Initialize sessions
   ExerciseSession morning = ExerciseSession.MORNING;
   ExerciseSession afternoon = ExerciseSession.AFTERNOON;
   ExerciseSession evening = ExerciseSession.EVENING;

    Exercise yoga = new Exercise("YOGA", 200, new ArrayList<>(), new ArrayList<>());
    Exercise dance = new Exercise("DANCE", 250, new ArrayList<>(), new ArrayList<>());
    Exercise zumba = new Exercise("ZUMBA", 300, new ArrayList<>(), new ArrayList<>());
    Exercise boxFit = new Exercise("BOX FIT", 100, new ArrayList<>(), new ArrayList<>());
    Exercise bodyBlitz = new Exercise("BODY BLITZ", 150, new ArrayList<>(), new ArrayList<>());
    Exercise aquacise = new Exercise("AQUACISE", 170, new ArrayList<>(), new ArrayList<>());

    public Booking() {
        this.createExercises();
        this.addExerciseReviews();
        this.addExerciseRatings();
        this.createTimeTable();
        this.registerStudents();
        this.showMenu();
    }

    //done
    public void createExercises() {
        this.exerciseList.add(yoga);
        this.exerciseList.add(dance);
        this.exerciseList.add(zumba);
        this.exerciseList.add(boxFit);
        this.exerciseList.add(bodyBlitz);
        this.exerciseList.add(aquacise);
    }

    public void addExerciseReviews(){
        reviewList.add("Glad I attended");
        reviewList.add("Bad class");
        reviewList.add("Awesome");
        reviewList.add("Boring class");reviewList.add("Interesting");
        reviewList.add("Enjoyed myself");reviewList.add("Got injured");
        reviewList.add("Tutor too fast");reviewList.add("Very Intense");
        reviewList.add("Burned calories");reviewList.add("Not okay");
        reviewList.add("Had a swell time");reviewList.add("Good workout");
        reviewList.add("Loved the atmosphere");reviewList.add("Got a bad back");
        reviewList.add("Too expensive");reviewList.add("Stole my shoes");
        reviewList.add("Too shoddy");reviewList.add("Shower was bad");
        reviewList.add("Smelly locker room ");reviewList.add("Awesome");
        reviewList.add("Great snacks afterwards ");reviewList.add("Met my soulmate");


        for (int i = 0; i < exerciseList.size(); i++) {
            for (int j = 0; j < 20; j++) {
                Random random = new Random();
                int x = random.nextInt(reviewList.size());
                exerciseList.get(i).addExerciseReview(reviewList.get(x));
            }
        }

    }

    public void addExerciseRatings(){

        for (int i = 0; i < exerciseList.size(); i++) {
            for (int j = 0; j < 20; j++) {
                Random random = new Random();
                int x = random.nextInt(5);
                exerciseList.get(i).addExerciseRating(x);
            }
        }
    }



    //revisit
    public void createTimeTable() {
        for(int weeks = 1; weeks < 9; weeks++) {
            List<Exercise> temp = new ArrayList();
            for (Exercise exercise : this.exerciseList) {
                temp.add(exercise);
            }

            ArrayList<String> timetable = new ArrayList<>();
            ExerciseCalendar satMorn = new ExerciseCalendar(yoga, morning);
            ExerciseCalendar satAft = new ExerciseCalendar(bodyBlitz, afternoon);
            ExerciseCalendar satEve = new ExerciseCalendar(zumba, evening);
            ExerciseCalendar sunMorn = new ExerciseCalendar(aquacise, morning);
            ExerciseCalendar sunAft = new ExerciseCalendar(boxFit, afternoon);
            ExerciseCalendar sunEve = new ExerciseCalendar(dance, evening);

            this.timeTable.add( satMorn);
            this.timeTable.add( satAft);
            this.timeTable.add( satEve);
            this.timeTable.add( sunMorn);
            this.timeTable.add( sunAft);
            this.timeTable.add( sunEve);
        }

    }

    //done
    public void registerStudents() {
        Student George = new Student("George", new ArrayList<>(), new ArrayList<>());
        Student Micheal = new Student("Micheal", new ArrayList<>(), new ArrayList<>());
        Student Dunstin = new Student("Dunstin", new ArrayList<>(), new ArrayList<>());
        Student Peter = new Student("Peter", new ArrayList<>(), new ArrayList<>());
        Student Hassan = new Student("Hassan", new ArrayList<>(), new ArrayList<>());
        Student Bob = new Student("Bob", new ArrayList<>(), new ArrayList<>());
        Student Kunle = new Student("Kunle", new ArrayList<>(), new ArrayList<>());
        Student Tunde = new Student("Tunde", new ArrayList<>(), new ArrayList<>());
        Student Ola = new Student("Ola", new ArrayList<>(), new ArrayList<>());
        Student Grande = new Student("Grande", new ArrayList<>(), new ArrayList<>());
        this.studentList.add(George);
        this.studentList.add(Micheal);
        this.studentList.add(Dunstin);
        this.studentList.add(Peter);
        this.studentList.add(Hassan);
        this.studentList.add(Bob);
        this.studentList.add(Kunle);
        this.studentList.add(Tunde);
        this.studentList.add(Ola);
        this.studentList.add(Grande);
    }

    //done
    public void showMenu() {
        while(true) {
         System.out.println();
         System.out.println("Welcome to the University Exercise booking system. Please Select Operation");
         System.out.println("Please Select an option using the number keys");
         System.out.println("1: Login");
         System.out.println("2: Generate reports");
         System.out.println("3: Show Timetable");
         System.out.println("4: Exit");
         System.out.print("INPUT: ");
         Scanner input = new Scanner(System.in);
         int selector = input.nextInt();
         switch (selector) {
            case 1 -> login();
            case 2 -> report();
            case 3 -> showTimetable();
            case 4 -> System.exit(1);
            default -> {
               System.out.println("You chose an invalid option");
               System.out.println("Please choose an option using numbers 1 to 4");
            }
         }
      }
    }

    public void showTimetable(){
        int count = 1;

        for (int i = 0; i < timeTable.size(); i++) {
            System.out.println(timeTable.get(i).toString());
        }
    }

    public void login() {
        while(true) {
            Student student = studentList.get(1);
            System.out.println();
            System.out.println("Welcome " + student.getStudentName() );
            System.out.println("Select Activity");
            System.out.println("1: Book Exercise");
            System.out.println("2: Change Booking");
            System.out.println("3: Attend Exercise");
            System.out.println("4: View profile");
            System.out.println("5: Logout");
            System.out.print("INPUT: ");
            Scanner input = new Scanner(System.in);
            String select = input.next();
            if (select.equals("1")) {
                this.bookExercise(student);
            } else if (select.equals("2")) {
                this.changeExercise(student);
            } else if (select.equals("3")) {
                this.attendExercise(student);
            } else {
                if (!select.equals("4")) {
                    return;
                }

                System.out.println("Profile");
                System.out.println("\n" + student);
            }
        }
    }


    public void bookExercise(Student student) {
        String exerciseName = this.bookGetExerciseName();
        Exercise exercise = this.getExercise(exerciseName);
        if (exercise != null) {
            if (!student.getExerciseBookings().isEmpty() && student.getExercises().contains(exercise.getExerciseName())) {
                System.out.println("Exercise already exist");
                return;
            }

            student = this.schedule(student, exercise);
            if (student != null) {
                System.out.println(student.getExerciseBookings());
            }
        }

    }

    public String bookGetExerciseName() {
        System.out.println();
        System.out.println("Exercises occur on both Saturdays and Sundays. The following are the list of exercises available");
        StringBuilder exercises = new StringBuilder("[");
        this.exerciseList.forEach((exercise) -> {
            exercises.append(exercise.getExerciseName() + ", ");
        });
        exercises.append("]");
        System.out.println(exercises);
        System.out.println("\nPlease enter either 'sunday' or 'saturday' to view the timetable available for each day or enter the exercise name to view the timetable for the exercise");
        System.out.print("INPUT: ");
        Scanner input = new Scanner(System.in);
        String option = input.nextLine().toLowerCase();
        return !option.equals("sunday") && !option.equals("sunday") ? this.tableForExercise(option) : this.tableForDay(option);
    }

    public int selectDay(String exerciseName) {
        System.out.println("\nAdd " + exerciseName + " to your schedule");
        System.out.println("Select Day");
        System.out.println("1: Saturday");
        System.out.println("2: Sunday");
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT: ");
        return input.nextInt();
    }

    public int selectSession() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nSelect Session");
        System.out.println("1: Morning");
        System.out.println("2: Afternoon");
        System.out.println("3: Evening");
        System.out.print("INPUT: ");
        return input.nextInt();
    }

    //revisit
    public Student schedule(Student student, Exercise exercise) {
        int day = this.selectDay(exercise.getExerciseName());
        int session = this.selectSession();
        boolean conflict = false;
        if (day > 0 & day < 3 & session > 0 & session < 4) {
            ExerciseCalendar schedule;
            if (day == 1) {
                if (session == 1) {
                    if (!this.isNotExerciseCalendard(student, saturday, morning)) {
                        schedule = new ExerciseCalendar(exercise, saturday, morning);
                        student.getExerciseBookings().add(schedule);
                        student.getExercises().add(schedule.getExercise());
                    } else {
                        conflict = true;
                    }
                } else if (session == 2) {
                    if (!this.isNotExerciseCalendard(student, saturday, afternoon)) {
                        schedule = new ExerciseCalendar(exercise, saturday, afternoon);
                        student.getExerciseBookings().add(schedule);
                        student.getExercises().add(schedule.getExercise());
                    } else {
                        conflict = true;
                    }
                } else if (session == 3) {
                    if (!this.isNotExerciseCalendard(student, saturday, evening)) {
                        schedule = new ExerciseCalendar(exercise, saturday, evening);
                        student.getExerciseBookings().add(schedule);
                        student.getExercises().add(schedule.getExercise());
                    } else {
                        conflict = true;
                    }
                }
            } else if (session == 1) {
                if (!this.isNotExerciseCalendard(student, sunday, morning)) {
                    schedule = new ExerciseCalendar(exercise, sunday, morning);
                    student.getExerciseBookings().add(schedule);
                    student.getExercises().add(schedule.getExercise());
                } else {
                    conflict = true;
                }
            } else if (session == 2) {
                if (!this.isNotExerciseCalendard(student, sunday, afternoon)) {
                    schedule = new ExerciseCalendar(exercise, sunday, afternoon);
                    student.getExerciseBookings().add(schedule);
                    student.getExercises().add(schedule.getExercise());
                } else {
                    conflict = true;
                }
            } else if (session == 3) {
                if (!this.isNotExerciseCalendard(student, saturday, evening)) {
                    schedule = new ExerciseCalendar(exercise, sunday, evening);
                    student.getExerciseBookings().add(schedule);
                    student.getExercises().add(schedule.getExercise());
                } else {
                    conflict = true;
                }
            }

            if (conflict) {
                System.out.println("Time conflict");
                return null;
            } else {
                this.exerciseList.forEach((exercise1) -> {
                    if (exercise1 == exercise) {
                        exercise1.setStudents(exercise.getNumberOfStudentsThatAttended() + 1);
                    }

                });
                this.updateStudentList(student);
                System.out.println("Booking was successful");
                return student;
            }
        } else {
            System.out.println("\nInvalid input");
            return null;
        }
    }

    //revisit
    public boolean isNotExerciseCalendard(Student student, ExerciseDay day, ExerciseSession session) {
        return student.getExerciseBookings().stream().anyMatch((schedule) -> {
            return schedule.getDay().equals(day) & schedule.getSession().equals(session);
        });
    }

    public Exercise getExercise(String exerciseName) {
        Iterator var2 = this.exerciseList.iterator();

        Exercise exercise;
        do {
            if (!var2.hasNext()) {
                System.out.println("Exercise can not be found");
                return null;
            }

            exercise = (Exercise)var2.next();
        } while(!exercise.getExerciseName().equals(exerciseName));

        if (exercise.getNumberOfStudentsThatAttended() < 5) {
            System.out.println("Space available");
            return exercise;
        } else {
            System.out.println("Exercise is at maximum capacity");
            return null;
        }
    }

    public String tableForDay(String day) {
        System.out.println("\nTIMETABLE FOR " + day.toUpperCase() + 'S');
        Set<String> exercises = new HashSet();
        int week = 1;

        for(Iterator var4 = this.timeTable.iterator(); var4.hasNext(); ++week) {
            if (day.equals("saturday")) {
                System.out.println("WEEK " + week);
                System.out.println("Saturday: ");
                exercises.add(exerciseList.get(0).toString());
                exercises.add(exerciseList.get(4).toString());
                exercises.add(exerciseList.get(2).toString());
            } else {
                System.out.println("WEEK " + week);
                System.out.println("Sunday: ");
                exercises.add(exerciseList.get(5).toString());
                exercises.add(exerciseList.get(3).toString());
                exercises.add(exerciseList.get(1).toString());
            }
        }

        System.out.println("\n----->>>Exercises<<<-----");
        this.exerciseList.forEach((exercise) -> {
            if (exercises.contains(exercise.getExerciseName())) {
                System.out.println(exercise);
            }

            System.out.println();
        });
        System.out.print("Book using exercise name: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine().toUpperCase();
    }

    public String tableForExercise(String exerciseName) {
        System.out.println("\nTIMETABLE FOR " + exerciseName);
        int week = 1;

        for(Iterator var3 = this.timeTable.iterator(); var3.hasNext(); ++week) {
            System.out.println("WEEK " + week);
            if ("zumba" == exerciseName.toLowerCase()) {
                System.out.println("Saturday: " + "evening");
            }

            if ("bodyblitz" == exerciseName.toLowerCase()) {
                System.out.println("Saturday: " + "afternoon");
            }

            if ("yoga" == exerciseName.toLowerCase()) {
                System.out.println("Saturday: " + "morning");
            }

            if ("aquacise" == exerciseName.toLowerCase()) {
                System.out.println("Sunday: " + "morning");
            }

            if ("boxfit" == exerciseName.toLowerCase()) {
                System.out.println("Sunday: " + "afternoon");
            }

            if ("dance" == exerciseName.toLowerCase()) {
                System.out.println("Sunday: " + "evening");
            }
        }

        Exercise exercise = this.getExerciseByName(exerciseName);
        System.out.println("\n" + exercise);
        System.out.print("Book exercise using the exercise name: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine().toUpperCase();
    }

    public int getBooking(Student student) {
        System.out.println("Select exercise to attend");
        int index = 0;

        for(Iterator var3 = student.getExerciseBookings().iterator(); var3.hasNext(); ++index) {
            ExerciseCalendar book = (ExerciseCalendar)var3.next();
            System.out.println(index + ": " + book);
            System.out.println();
        }

        Scanner input = new Scanner(System.in);
        System.out.print("INPUT: ");
        return input.nextInt();
    }

    //revisit
    public void attendExercise(Student student) {
        if (student.getExerciseBookings().isEmpty()) {
            System.out.println("No Booked exercise found");
        } else {
            int bookingIndex = this.getBooking(student);
            System.out.println("Thank you for attending this exercise");
            String exerciseName = (student.getExerciseBookings().get(bookingIndex)).getExercise().getExerciseName();
            this.exerciseList.forEach((exercise) -> {
                if (exercise.getExerciseName().equals(exerciseName)) {
                    int val = exercise.getNumberOfStudentsThatAttended();
                    exercise.studentAttended+=val;
                }

            });
            System.out.println("1: Review and Rate");
            System.out.println("2: Back");
            System.out.print("INPUT: ");
            Scanner input = new Scanner(System.in);
            String select = input.next();
            if (select.equals("1")) {
                this.rateAndReview(exerciseName);
            }

            this.updateStudentList(student);
        }
    }

    public void updateStudentList(Student student) {
        this.studentList.forEach((student1) -> {
            if (student1.getStudentName().equals(student.getStudentName())) {
                student1.setExercises(student.getExercises());
                student1.setExerciseBookings(student.getExerciseBookings());
            }

        });
    }

    //done
    public void rateAndReview(String exerciseName) {
        System.out.println("\nReview and Rate " + exerciseName + " exercise");
        Scanner input = new Scanner(System.in);
        System.out.print("Review: ");
        String review = input.nextLine().trim();
        if (review.isEmpty()) {
            review = "No Review";
        }

        System.out.println("\nRating");
        System.out.println("1: Very Dissatisfied");
        System.out.println("2: Dissatisfied");
        System.out.println("3: OK");
        System.out.println("4: Satisfied");
        System.out.println("5: Very Satisfied");
        Scanner rateInput = new Scanner(System.in);
        System.out.print("INPUT: ");
        int rating = rateInput.nextInt();
        String finalReview = review;
        this.exerciseList.forEach((exercise) -> {
            if (exercise.getExerciseName().equals(exerciseName)) {
                exercise.getExerciseReviews().add(finalReview);
                exercise.getExerciseRatings().add(rating);
                System.out.println("Review and rating saved successfully.");
            }

        });
    }

    public void changeExercise(Student student) {
        int select = this.getBooking(student);
        String exerciseName = this.bookGetExerciseName();
        Exercise exercise = this.getExercise(exerciseName);
        if (exercise != null) {
            ExerciseCalendar schedule = student.getExerciseBookings().remove(select);
            student.getExercises().remove(schedule.getExercise());
            student = this.schedule(student, exercise);
            if (student == null) {
                student.getExerciseBookings().add(schedule);
                student.getExercises().add(schedule.getExercise());
                this.updateStudentList(student);
            } else {
                this.exerciseList.forEach((exercise1) -> {
                    if (exercise1.getExerciseName().equals(schedule.getExercise())) {
                        int max = exercise1.getNumberOfStudentsThatAttended();
                        exercise1.setStudents(max - 1);
                    }

                });
            }
        }

    }

    public void report() {
        System.out.println("Select report");
        System.out.println("1: Show Monthly report for all exercises");
        System.out.println("2: Show Monthly Champion report");
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT: ");
        int select = input.nextInt();
        if (select == 1) {
            this.allReport();
        } else if (select == 2) {
            this.specialReport();
        }

    }

    public void allReport() {
        System.out.println("\nAll Exercise Report");
        Iterator var1 = this.exerciseList.iterator();

        while(var1.hasNext()) {
            Exercise exercise = (Exercise)var1.next();
            String name = exercise.getExerciseName();
            int students = exercise.getNumberOfStudentsThatAttended();
            List<String> reviews = exercise.getExerciseReviews();
            int averageRate = 0;

            int attendance;
            for(Iterator var7 = exercise.getExerciseRatings().iterator(); var7.hasNext(); averageRate += attendance) {
                attendance = (Integer)var7.next();
            }

            if (averageRate > 0) {
                averageRate /= exercise.getExerciseRatings().size();
            }

            float fee = exercise.getExercisePrice();
            attendance = exercise.getNumberOfStudentsThatAttended();
            System.out.println("Name         " + name);
            System.out.println("Fee          " + fee);
            System.out.println("Bookings     " + students);
            System.out.println("Attendance   " + attendance);
            System.out.println("Average rate " + averageRate);
            System.out.println("Reviews");
            Iterator var9 = reviews.iterator();

            while(var9.hasNext()) {
                String review = (String)var9.next();
                System.out.println("     - " + review);
            }

            System.out.println();
        }

    }

    public void specialReport() {
        float max = 0;
        Exercise exercise = null;
        Iterator var3 = this.exerciseList.iterator();

        while(var3.hasNext()) {
            Exercise exercise1 = (Exercise)var3.next();
            float income = exercise1.getExercisePrice() * exercise1.getNumberOfStudentsThatAttended();
            if (income > max) {
                max = income;
                exercise = exercise1;
            }
        }

        if (exercise == null) {
            System.out.println("No exercise was attended");
        } else {
            System.out.println("Report of the exercise with highest income generation");
            System.out.println("Name: " + exercise.getExerciseName());
            System.out.println("Total income: " + exercise.getExercisePrice() * exercise.getNumberOfStudentsThatAttended());
        }
    }

    public Exercise getExerciseByName(String exerciseName) {
        return (Exercise)this.exerciseList.stream().filter((exercise) -> {
            return exercise.getExerciseName().equals(exerciseName);
        }).findFirst().orElse(null);
    }
}
