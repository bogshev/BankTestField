package Actions;

import Users.Costumer;
import Users.Employer;
import Users.Manager;
import Users.User;

public class Transfer{



     public static void action(User iDS, User iDG, int amount){
        //user1.sendMoney(100);
        //user2.gainMoney(100);

        if(iDS instanceof Manager){
            int tax = 5;
            iDS.sendMoney(amount+(amount/100*tax));


        }else if(iDS instanceof Employer){
            int tax = 10;
            iDS.sendMoney(amount+(amount/100*tax));

        }else if(iDS instanceof Costumer){
            int tax = 15;
            iDS.sendMoney(amount+(amount/100*tax));

        }

        iDG.gainMoney(amount);

    }


}