package Actions;

import Users.Costumer;
import Users.Employer;
import Users.Manager;
import Users.User;

import java.util.ArrayList;

public class HeatingUp {
    ArrayList<User> eList;
    public HeatingUp(ArrayList<User> list){
        eList = list;
    }

    public void action(){

        for(int i = 1; i<=10; i++){
            eList.add(new Costumer("Default costumer-"+i));
            eList.add(new Employer("Default employer-"+i));
            eList.add(new Manager("Default manager-"+i));
        }
    }

}
