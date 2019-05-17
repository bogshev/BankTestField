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
            //Math.random()
                    StringBuffer stringBuffer = new StringBuffer("I am not GAY");
            stringBuffer.delete(stringBuffer.indexOf("not"),stringBuffer.indexOf("not")+3);
            System.out.println(stringBuffer);
        }
    }

    public String randomId(){
        return "";
    }

}
