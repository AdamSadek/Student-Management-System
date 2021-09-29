package Project;

import java.util.HashMap;
import java.util.Scanner;

public class Enroll {
    private static HashMap<Integer, String> courses = new HashMap<>();
    public static HashMap<Integer, String> names = new HashMap<>();
    public static int iD = 0;
    public static void setName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full name: ");
        while(!input.hasNext("[A-Za-z]*")){
            System.out.print("Please enter a valid full name: ");
            input.nextLine();
        }
        String fullName = input.nextLine();
        fullName = fullName.toLowerCase();
        System.out.println("Hello " + fullName + "! your ID number is: " + (iD + 1) + "\n");
        names.putIfAbsent(++iD, fullName);

    }
    public static void setClasses(){
        userIntroduction.listOfCourses();
        int userChoice = errorChecks.validIntegerCourses();
        switch (userChoice){
            case 1:
                courses.put(iD, "English Literature");
                System.out.println(names.get(iD) + " has been enrolled in the English Literature course");
                Fees.fees.put(iD, 10000);
                break;
            case 2:
                courses.put(iD, "Mathematics");
                System.out.println(names.get(iD) + " has been enrolled in the Mathematics course!");
                Fees.fees.put(iD, 12250);
                break;
            case 3:
                courses.put(iD, "Bio Medicine");
                System.out.println(names.get(iD) + " has been enrolled in the Bio Medicine course!");
                Fees.fees.put(iD, 16250);
                break;
            case 4:
                courses.put(iD, "Computer Science");
                System.out.println(names.get(iD) + " has been enrolled in the Computer Science course!");
                Fees.fees.put(iD, 16000);
                break;
            case 5:
                courses.put(iD, "Software Engineering");
                System.out.println(names.get(iD) + " has been enrolled in the Software Engineering course!");
                Fees.fees.put(iD, 16000);
                break;
            case 6:
                courses.put(iD, "Economics");
                System.out.println(names.get(iD) + " has been enrolled in the Economics course!");
                Fees.fees.put(iD, 15500);
                break;
            case 7:
                courses.put(iD, "Business");
                System.out.println(names.get(iD) + " has been enrolled in the Business course!");
                Fees.fees.put(iD, 15250);
                break;
        }
    }
    public static void getDetails(){
        System.out.println("Names: " + names.toString());
        System.out.println("Courses: " + courses.toString());
        System.out.println("Fees: " + Fees.fees.toString());
    }

}
