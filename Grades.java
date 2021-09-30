package Project;

import java.util.HashMap;
import java.util.Scanner;

public class Grades {
    static double userGrades;
    static HashMap<Integer,Double> grades = new HashMap<>();
    public static void currentGrades(){
        Scanner input = new Scanner(System.in);
        userID.setUserID();

        if(grades.get(Enroll.iD) == null){
            System.out.print("Please enter grade: ");
            while(true){
                try{
                    userGrades = input.nextInt();
                    if(userGrades > 100.0 || userGrades < 0.0){
                        System.out.print("Please enter valid grade: ");
                    }else{
                        grades.replace(userID.getUserID(), userGrades);
                        break;
                    }
                }catch (Exception e){
                    System.out.print("Please enter a grade: ");
                    input.next();
                }
            }
        }
         System.out.println("Your current grade for " + Enroll.courses.get(userID.getUserID()) + ": " + userGrades);

    }

}
