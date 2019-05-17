package Actions;

import Users.Costumer;
import Users.Employer;
import Users.Manager;
import Users.User;

import java.util.ArrayList;

public class HeatingUp {
    private ArrayList<User> eList;
    public HeatingUp(ArrayList<User> list){
        eList = list;
    }

    public void action(int n){
        for(int i = 1; i<=10; i++){
            eList.add(new Costumer("c-"+randomId(n)));
            eList.add(new Employer("e-"+randomId(n)));
            eList.add(new Manager("m-"+randomId(n)));
//            StringBuffer stringBuffer = new StringBuffer("I am not GAY");
//            stringBuffer.delete(stringBuffer.indexOf("not"),stringBuffer.indexOf("not")+3);
//            System.out.println(stringBuffer);
        }
    }

    private String randomId(int n){
        String id = "0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<n;i++){
            int index = (int) (id.length()*Math.random());
            sb.append(id.charAt(index));
        }
         return sb.toString();
    }

}
