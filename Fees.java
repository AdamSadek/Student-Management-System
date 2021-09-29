package Project;

import java.util.HashMap;

public class Fees {
    public static HashMap<Integer, Integer> fees = new HashMap<>();
    public static void payment() {
        userID.askAmountToPay();
        }
    public static boolean isNull(){
        return Fees.fees.get(userID.getUserID()) == null;
    }
    public static void viewBalance()
    {
        while(true) {
            userID.setUserID();
            if (isNull()) {
                System.out.println("This ID does not exist!");
            } else {
                System.out.println("You total balance is: " + "$" + Fees.fees.get(userID.getUserID()));
                break;
            }
        }
        }
    }


