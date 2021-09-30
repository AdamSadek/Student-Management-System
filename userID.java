package Project;

import java.util.Scanner;

public class userID {
    static int studentID;
    public static void setUserID() {
        studentID = errorChecks.validId();
    }
    public static int getUserID(){
        return studentID;
    }


}
