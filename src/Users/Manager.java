package Users;

public class Manager extends BaseUser {


    public Manager(String name) {
        super(name);
    }

    public void iD(){
        System.out.println(getId()+ " Manager");

    }

}
