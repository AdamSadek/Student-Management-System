package Project;

public class userIntroduction {
    public static void intro(){
        System.out.println("========== Welcome to the University of Westminster ==========");
        System.out.println(" 1. Enroll \n 2. Pay Fees \n 3. Current Grades \n 4. View Balance \n 5. View Students \n 6. Exit");
        System.out.println("---------------------------------------------------------------");
        System.out.print("What would you like to do?: ");
    }
    public static void choices(){
        System.out.println(" 1. Enroll \n 2. Pay Fees \n 3. Current Grades \n 4. View Balance \n 5. View Students \n 6. Exit");
        System.out.println("---------------------------------------------------------------");
        System.out.print("What would you like to do?: ");
    }
    public static void listOfCourses(){
        System.out.print("Please select 1 course below:\n -----------------------------\n");
        System.out.println(" 1. English Literature \n 2. Mathematics\n 3. Bio Medicine\n 4. Computer Science \n " +
                "5. Software Engineering \n 6. Economics \n 7. Business \n -----------------------------");
        System.out.print("Which course would you like?: ");
    }

}
