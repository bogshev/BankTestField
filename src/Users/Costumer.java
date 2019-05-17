package Users;

public class Costumer extends BaseUser {


    public Costumer(String name) {
        super(name);
    }

    public void iD(){
        System.out.println(getId()+ " Costumer");

    }
}
