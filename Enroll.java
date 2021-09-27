package Project_1;

import java.util.*;

public class Enroll {
    private static HashMap<Integer, String> courses = new HashMap<>();
    public static HashMap<Integer, String> names = new HashMap<>();
    private static int iD = 0;
    public static void setNames(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full name: ");
        while(!input.hasNext("[A-Za-z]*")){
            System.out.print("Please enter a valid full name: ");
            input.nextLine();
        }
        String fullName = input.nextLine();
        fullName = fullName.toLowerCase();
        System.out.println("Hello " + fullName + "! your ID number is: " + iD + "\n");
        names.putIfAbsent(++iD, fullName);

    }
    public static void setClasses(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please select 1 course below:\n -----------------------------\n");
        System.out.println(" 1. English Literature \n 2. Mathematics\n 3. Bio Medicine\n 4. Computer Science \n " +
                "5. Software Engineering \n 6. Economics \n 7. Business \n -----------------------------");
        System.out.print("Which course would you like?: ");
        while(!(input.hasNextInt())){
            System.out.print("Please enter an Integer: ");
            input.next();
        }
        int user_choice = input.nextInt();
        while(user_choice < 1 || user_choice > 7){
            System.out.print("Please enter a valid integer(1-7): ");
            user_choice = input.nextInt();
        }
        switch (user_choice){
            case 1:
                courses.put(iD, "English Literature");
                System.out.println(names.get(iD) + " has been enrolled in the English Literature course");
                break;
            case 2:
                courses.put(iD, "Mathematics");
                System.out.println(names.get(iD) + " has been enrolled in the Mathematics course!");
                break;
            case 3:
                courses.put(iD, "Bio Medicine");
                System.out.println(names.get(iD) + " has been enrolled in the Bio Medicine course!");
                break;
            case 4:
                courses.put(iD, "Computer Science");
                System.out.println(names.get(iD) + " has been enrolled in the Computer Science course!");
                break;
            case 5:
                courses.put(iD, "Software Engineering");
                System.out.println(names.get(iD) + " has been enrolled in the Software Engineering course!");
                break;
            case 6:
                courses.put(iD, "Economics");
                System.out.println(names.get(iD) + " has been enrolled in the Economics course!");
                break;
            case 7:
                courses.put(iD, "Business");
                System.out.println(names.get(iD) + " has been enrolled in the Business course!");
                break;
        }
    }
    public static void getDetails(){
        System.out.println(names.toString());
        System.out.println(courses.toString());
    }

}
