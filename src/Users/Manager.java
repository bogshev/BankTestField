package Users;

public class Manager extends BaseUser {


    public Manager(String id) {
        super(id);
    }

    public void iD(){
        System.out.println(getId()+ " Manager");

    }

}
